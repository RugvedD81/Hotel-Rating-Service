package com.user.service.User_Service.Exception;

import org.springframework.http.ResponseEntity;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super("Resource not found on server!!");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
