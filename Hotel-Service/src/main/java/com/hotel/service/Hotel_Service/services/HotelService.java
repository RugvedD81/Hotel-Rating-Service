package com.hotel.service.Hotel_Service.services;

import com.hotel.service.Hotel_Service.entity.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    //create a hotel
    Hotel saveHotel(Hotel hotel);

    //get all hotels
    List<Hotel> getAll();

    //get hotel by id
    Hotel getHotel(String id);
}
