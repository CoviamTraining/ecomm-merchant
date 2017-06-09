package com.coviam.ecommmerchant.controller;

import org.springframework.boot.context.config.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by gaurav on 08/06/17.
 * TODO Handle all the exception for all different kind of exception
 * TODO For Now, 1000 is default exception code for us
 */
@ControllerAdvice
public class ErrorHandlingController {

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity<Integer> pageNotFoundException() {
        return new ResponseEntity<Integer>(1000,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Integer> internalServeException(){
        return new ResponseEntity<Integer>(1000,HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
