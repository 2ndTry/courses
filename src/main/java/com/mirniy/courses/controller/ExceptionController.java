package com.mirniy.courses.controller;

import com.mirniy.courses.exception.ApiException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiException> handleException(Exception e) {
        return new ResponseEntity<>(new ApiException(1, e.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
