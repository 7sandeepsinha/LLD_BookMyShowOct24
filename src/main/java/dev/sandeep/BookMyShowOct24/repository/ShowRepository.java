package dev.sandeep.BookMyShowOct24.repository;

import dev.sandeep.BookMyShowOct24.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer> {
}
