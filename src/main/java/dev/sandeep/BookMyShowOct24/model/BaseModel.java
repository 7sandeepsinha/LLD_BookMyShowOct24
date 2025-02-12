package dev.sandeep.BookMyShowOct24.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass // marking this class, that all attributes should be present in all child class tables
@EntityListeners(AuditingEntityListener.class) // listens to all entity changes - basically any change in table for an entity - whether creation of new row or updation of existing row
public abstract class BaseModel {
    @Id // tells JPA that this field is the PK
    @GeneratedValue(strategy = GenerationType.AUTO) // automatically generate the value for ID
    private int id;
    @CreatedDate
    @Temporal(value = TemporalType.TIMESTAMP) // tells JPA this field is going to store timestamp
    private LocalDateTime createdAt;
    @LastModifiedDate
    @Temporal(value = TemporalType.TIMESTAMP) // tells JPA this field is going to store timestamp
    private LocalDateTime updatedAt;
//    @CreatedBy
//    private String createdBy;
//    @LastModifiedBy
//    private String updatedBy;
}
