package dev.sandeep.BookMyShowOct24.model;

import dev.sandeep.BookMyShowOct24.model.constant.AuditoriumFeatures;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel {
    private String name;
    private int capacity;
    @OneToMany
    private List<Seat> seats;
    @OneToMany
    private List<Show> shows;
    @ElementCollection // creates a relationship between auditorium and enum table
    @Enumerated(EnumType.STRING) // creates a table for the values present in ENUM
    private List<AuditoriumFeatures> auditoriumFeatures;
}
