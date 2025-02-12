package dev.sandeep.BookMyShowOct24.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    private String name;
    private String language;
}
/*
    {
        "name" : "Titanic",
        "language" : "English"
    }
 */