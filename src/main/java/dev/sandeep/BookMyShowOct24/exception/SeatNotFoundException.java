package dev.sandeep.BookMyShowOct24.exception;

public class SeatNotFoundException extends RuntimeException {
    public SeatNotFoundException() {
    }

    public SeatNotFoundException(String message) {
        super(message);
    }
}
