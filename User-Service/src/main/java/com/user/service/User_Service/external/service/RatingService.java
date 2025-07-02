package com.user.service.User_Service.external.service;

import com.user.service.User_Service.entity.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Service
@FeignClient(name = "RATING-SERVICE")
public interface RatingService {

    //create rating
    @PostMapping("/ratings")
    public Rating create(Rating values);

    //update
    @PutMapping("/ratings/{ratingId}")
    public Rating updateRating(Rating rating);

    //Delete
    @DeleteMapping("/ratings/{ratingId}")
    public void deleteRating(@PathVariable String ratingId);


}

