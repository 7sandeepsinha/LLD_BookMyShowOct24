package dev.sandeep.BookMyShowOct24.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity // telling JPA to create a table for City
public class City extends BaseModel {
    private String name;
    @OneToMany // setting cardinality between City and Theatre
    private List<Theatre> theatres;
}
