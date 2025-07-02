package com.user.service.User_Service;

import com.user.service.User_Service.entity.Rating;
import com.user.service.User_Service.external.service.RatingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private RatingService ratingService;

	@Test
	void createRating() {
		Rating rating = Rating.builder().rating(10).userId("").hotelId("").feedback("This rating is created by the feign client").build();
		Rating savedRating = ratingService.create(rating);

		System.out.println("New rating created");


	}
}


