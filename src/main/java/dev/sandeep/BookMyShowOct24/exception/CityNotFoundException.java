package dev.sandeep.BookMyShowOct24.exception;

public class CityNotFoundException extends RuntimeException {
    public CityNotFoundException() {
    }

    public CityNotFoundException(String message) {
        super(message);
    }
}
