package com.DNDMaker.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidCharacterException extends RuntimeException {
    public InvalidCharacterException() {
        super("Character Not Found.");
    }
}

