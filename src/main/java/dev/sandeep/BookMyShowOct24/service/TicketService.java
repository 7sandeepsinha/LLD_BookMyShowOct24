package dev.sandeep.BookMyShowOct24.service;

import dev.sandeep.BookMyShowOct24.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;
}
