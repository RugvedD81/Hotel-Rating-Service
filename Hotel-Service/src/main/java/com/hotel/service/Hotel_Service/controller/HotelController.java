package com.hotel.service.Hotel_Service.controller;

import com.hotel.service.Hotel_Service.entity.Hotel;
import com.hotel.service.Hotel_Service.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    //create Hotel
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        Hotel hotel1 = hotelService.saveHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }

    //get All hotels
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels(){
       List<Hotel> hotel =hotelService.getAll();
        return ResponseEntity.ok(hotel);
    }

    //get hotel by id
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getById(@PathVariable String hotelId){
        Hotel HotelId = hotelService.getHotel(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(HotelId);
    }
}
