package dev.sandeep.BookMyShowOct24.model;

import dev.sandeep.BookMyShowOct24.model.constant.ShowSeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    private int price;
    private Show show;
    private Seat seat;
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus seatStatus;
}
