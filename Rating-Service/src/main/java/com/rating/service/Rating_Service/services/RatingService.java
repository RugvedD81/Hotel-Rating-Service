package com.rating.service.Rating_Service.services;

import com.rating.service.Rating_Service.entity.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    //create
    Rating createRating(Rating rating);

    //get allRatings
    List<Rating> getAllRatings();

    //get all ratings by userId
    List<Rating> getRatingByUserId(String userId);

    //get all ratings by HotelId
    List<Rating> getRatingByHotelId(String hotelId);

}
