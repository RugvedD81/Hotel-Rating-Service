package com.hotel.service.Hotel_Service.Exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String s) {
        super(s);
    }

    public ResourceNotFoundException(){
        super("Hotel id is not found on the server");
    }
}
