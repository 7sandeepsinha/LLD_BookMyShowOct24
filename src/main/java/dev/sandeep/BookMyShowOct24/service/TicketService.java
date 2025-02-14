package dev.sandeep.BookMyShowOct24.service;

import dev.sandeep.BookMyShowOct24.exception.SelectedSeatsNotAvailableException;
import dev.sandeep.BookMyShowOct24.model.Show;
import dev.sandeep.BookMyShowOct24.model.ShowSeat;
import dev.sandeep.BookMyShowOct24.model.Ticket;
import dev.sandeep.BookMyShowOct24.model.User;
import dev.sandeep.BookMyShowOct24.model.constant.ShowSeatStatus;
import dev.sandeep.BookMyShowOct24.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private ShowSeatService showSeatService;
    @Autowired
    private ShowService showService;

    public Ticket createTicket(int userId, List<Integer> showSeatIds){
        User user = userService.getUserById(userId);
        List<ShowSeat> showSeats = new ArrayList<>();
        int totalCost = 0;

        showSeats = checkAndLockShowSeats(showSeatIds);

        //TODO: payment done here logic
        // if payments fails then move showSeat back to available state

        Ticket ticket = new Ticket();
        ticket.setUser(user);
        ticket.setShowSeats(showSeats);
        ticket.setShow(showSeats.getFirst().getShow());
        ticket.setTotalCost(totalCost);

        for(ShowSeat showSeat: showSeats){
            showSeat.setSeatStatus(ShowSeatStatus.BOOKED);
            showSeatService.updateShowSeat(showSeat);
        }

        return ticketRepository.save(ticket);
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public List<ShowSeat> checkAndLockShowSeats(List<Integer> showSeatIds){
        // CHECK IF ALL SEATS ARE AVAILABLE
        List<ShowSeat> showSeats = new ArrayList<>();
        for(int showSeatId: showSeatIds){
            ShowSeat showSeat = showSeatService.getShowSeatById(showSeatId);
            if(!showSeat.getSeatStatus().equals(ShowSeatStatus.AVAILABLE)){
                throw new SelectedSeatsNotAvailableException("Seats selected for booking are not available");
            }
        }
        //LOCK THE SELECTED SEATS --- the loop above and this loop cant be merged
        for(int showSeatId: showSeatIds){
            ShowSeat showSeat = showSeatService.getShowSeatById(showSeatId);
            showSeat.setSeatStatus(ShowSeatStatus.LOCKED);
            showSeats.add(showSeat);
            showSeatService.updateShowSeat(showSeat);
        }
        return showSeats;
    }
}
