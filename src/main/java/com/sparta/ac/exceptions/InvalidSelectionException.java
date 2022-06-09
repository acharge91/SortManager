package com.sparta.ac.exceptions;

public class InvalidSelectionException extends Exception{
    private final String message;

    public InvalidSelectionException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
