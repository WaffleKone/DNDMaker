package com.DNDMaker.exceptions;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
    private String status;
    private String message;
    private int code;

    public ErrorResponse(Exception e, HttpStatus httpStatus) {
        this.status = httpStatus.name();
        this.message = e.getMessage();
        this.code = httpStatus.value();
    }

}
