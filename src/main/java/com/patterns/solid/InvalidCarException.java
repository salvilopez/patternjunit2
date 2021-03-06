package com.patterns.solid;

public class InvalidCarException extends Throwable {
    public InvalidCarException(String errorMessage, Throwable cause) {super(errorMessage,cause);
    }
}
