package com.rating.service.Rating_Service.repository;

import com.rating.service.Rating_Service.entity.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating,String> {

    //we have to create a custom finder methods
    //because we do not get those methods in rating service

    List<Rating> findByUserId(String userId);

    List<Rating> findByHotelId(String hotelId);
}
