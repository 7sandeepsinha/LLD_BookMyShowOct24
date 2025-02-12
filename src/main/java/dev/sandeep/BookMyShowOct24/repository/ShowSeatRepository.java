package dev.sandeep.BookMyShowOct24.repository;

import dev.sandeep.BookMyShowOct24.model.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer> {
}
