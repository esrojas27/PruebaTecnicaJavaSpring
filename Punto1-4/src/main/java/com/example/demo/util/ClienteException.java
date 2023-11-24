package com.example.demo.util;

public class ClienteException extends RuntimeException {

    private final int statusCode;

    public ClienteException(int statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
