package dev.sandeep.BookMyShowOct24.repository;

import dev.sandeep.BookMyShowOct24.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
