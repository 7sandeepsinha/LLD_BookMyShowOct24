package dev.sandeep.BookMyShowOct24.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass // marking this class, that all attributes should be present in all child class tables
public abstract class BaseModel {
    @Id // tells JPA that this field is the PK
    @GeneratedValue(strategy = GenerationType.AUTO) // automatically generate the value for ID
    private int id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
}
