package com.hotel.service.Hotel_Service.repository;

import com.hotel.service.Hotel_Service.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,String> {
}
