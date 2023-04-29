package com.herbalife.springbootrestapi.exception;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class AppExceptionHandler {
    @ExceptionHandler(TopicFoundException.class)
    public HttpEntity<String> topicFoundException(TopicFoundException ex, WebRequest webRequest) {
        String message = "Error: " + ex.getMessage();
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(TopicNotFoundException.class)
    public HttpEntity<String> topicNotFoundException(TopicNotFoundException ex, WebRequest webRequest) {
        String message = "Error: " + ex.getMessage();
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
