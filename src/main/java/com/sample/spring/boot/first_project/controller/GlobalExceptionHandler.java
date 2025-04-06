package com.sample.spring.boot.first_project.controller;

import com.sample.spring.boot.first_project.StudentAlreadyException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleCustomException(RuntimeException ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(StudentAlreadyException.class)
    @ResponseStatus(HttpStatus.FOUND)
    public String handleCustomException(StudentAlreadyException ex) {
        return ex.getMessage();
    }
}
