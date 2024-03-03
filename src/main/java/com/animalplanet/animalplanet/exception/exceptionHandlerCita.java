package com.animalplanet.animalplanet.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class exceptionHandlerCita {

    @ExceptionHandler(value = {notFoundExceptionCitas.class})
    public ResponseEntity<Object> handleCitaNoFoundException(notFoundExceptionCitas notFoundExceptionCitas)
    {
        exceptionCita exceptionCita = new exceptionCita(
         notFoundExceptionCitas.getMessage(),
         notFoundExceptionCitas.getCause(),
                HttpStatus.NOT_FOUND

        );

        return new ResponseEntity<>(exceptionCita, HttpStatus.NOT_FOUND);

    }

}
