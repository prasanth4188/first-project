package com.sample.spring.boot.first_project;

public class StudentAlreadyException extends RuntimeException {
    String message;

    public StudentAlreadyException(String message) {
        super(message);
        this.message = message;
    }
}
