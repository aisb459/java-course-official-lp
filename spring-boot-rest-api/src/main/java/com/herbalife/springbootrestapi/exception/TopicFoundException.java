package com.herbalife.springbootrestapi.exception;

public class TopicFoundException extends RuntimeException{
    public TopicFoundException(String message) {
        super(message);
    }
}