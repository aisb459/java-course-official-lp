package com.herbalife.jpawithspringboot.lab03.exception;

public class TopicFoundException extends RuntimeException{
    public TopicFoundException(String message) {
        super(message);
    }
}
