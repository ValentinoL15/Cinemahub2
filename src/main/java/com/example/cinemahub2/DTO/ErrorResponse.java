package com.example.cinemahub2.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
public class ErrorResponse {

<<<<<<< HEAD
    private Date timestamp = new Date();
    private int status;
    private String error;
    private String message;
    private String url;

    public ErrorResponse(String message, int status, String error,String url){
        this.message = message;
        this.url = url.replace("uri=", "");
        this.status = status;
        this.error = error;
=======
    private Date hour = new Date();
    private String message;
    private String url;

    public ErrorResponse(String message, String url){
        this.message = message;
        this.url = url.replace("uri=", "");
>>>>>>> DEV-MAIN
    }
}
