package com.matchify.exception;


import org.springframework.security.core.AuthenticationException;

public class WrongCredentialsException extends AuthenticationException {
    public WrongCredentialsException(String message) {
        super(message);
    }
}
