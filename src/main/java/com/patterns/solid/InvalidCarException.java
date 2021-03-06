package com.patterns.solid;

public class InvalidCarException extends Exception {
    public InvalidCarException(String errorMessage, Throwable cause) {super(errorMessage,cause);
    }
}
