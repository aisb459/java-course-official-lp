package com.herbalife.jpawithspringboot.lab03.exception;

public class TopicNotFoundException extends RuntimeException{
    public TopicNotFoundException(String message) {
        super(message);
    }
}
