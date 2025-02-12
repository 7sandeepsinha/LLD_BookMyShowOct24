package dev.sandeep.BookMyShowOct24.exception;

public class TheatreNotFoundException extends RuntimeException {
    public TheatreNotFoundException() {
    }

    public TheatreNotFoundException(String message) {
        super(message);
    }
}
