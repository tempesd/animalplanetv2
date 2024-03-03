package com.animalplanet.animalplanet.exception;

public class notFoundExceptionCitas extends RuntimeException{
    public notFoundExceptionCitas(String message) {
        super(message);
    }

    public notFoundExceptionCitas(String message, Throwable cause) {
        super(message, cause);
    }
}
