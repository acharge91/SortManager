package com.sparta.ac.binarytree;

public class ChildNotFoundException extends Exception{

    private final String message;
    public ChildNotFoundException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
