package com.hotel.service.Hotel_Service.services.impl;

import com.hotel.service.Hotel_Service.entity.Hotel;
import com.hotel.service.Hotel_Service.repository.HotelRepository;
import com.hotel.service.Hotel_Service.Exception.ResourceNotFoundException;
import com.hotel.service.Hotel_Service.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;


    @Override
    public Hotel saveHotel(Hotel hotel) {
        String randomUUID = UUID.randomUUID().toString();
        hotel.setId(randomUUID);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }


    @Override
    public Hotel getHotel(String id) {
        return hotelRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Hotel not found with id: "+id));
    }
}
