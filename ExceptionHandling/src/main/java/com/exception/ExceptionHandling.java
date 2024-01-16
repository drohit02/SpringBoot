package com.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandling extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> exceptionHandler(Exception ex, WebRequest req) {
        String bodyOfResponse = "Something Went Wrong !!!";
        
        HttpHeaders header = new HttpHeaders();
        header.set("Custom-Header", "404 Bad Requst ");
        System.out.println(header);
        return handleExceptionInternal(ex, bodyOfResponse, header, HttpStatus.BAD_REQUEST, req);
    }
}
