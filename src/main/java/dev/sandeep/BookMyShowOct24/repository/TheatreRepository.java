package dev.sandeep.BookMyShowOct24.repository;

import dev.sandeep.BookMyShowOct24.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Integer> {
}
