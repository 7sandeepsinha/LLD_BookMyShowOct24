package dev.sandeep.BookMyShowOct24.repository;

import dev.sandeep.BookMyShowOct24.model.Auditorium;
import dev.sandeep.BookMyShowOct24.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriumRepository extends JpaRepository<Auditorium, Integer> {
}
