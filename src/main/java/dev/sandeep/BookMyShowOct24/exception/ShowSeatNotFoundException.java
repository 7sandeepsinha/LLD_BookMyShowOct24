package dev.sandeep.BookMyShowOct24.exception;

public class ShowSeatNotFoundException extends RuntimeException {
    public ShowSeatNotFoundException() {
    }

    public ShowSeatNotFoundException(String message) {
        super(message);
    }
}
