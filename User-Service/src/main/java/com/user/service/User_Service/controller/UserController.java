package com.user.service.User_Service.controller;

import com.user.service.User_Service.entity.User;
import com.user.service.User_Service.services.UserService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    private Logger logger;
    //create
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
       User user1= userService.saveUser(user);
       return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    //get user by id
    @GetMapping("/{userId}")
    @CircuitBreaker(name = "ratingHotelBreaker",fallbackMethod ="ratingHotelFallback")
    public ResponseEntity<User> getUserById(@PathVariable String userId){
        User user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }

    //creating fall back method for circuit breaker
    public ResponseEntity<User> ratingHotelFallback(String userId, Exception ex){
        logger.info("Fallback is executed because service is down: "+ex.getMessage());
       User user=User.builder()
               .email("dummy@gmail.com")
               .name("Dummy")
               .about("This is the dummy user created because of the service down")
               .userId("123321")
               .build();
        return new  ResponseEntity<>(user,HttpStatus.OK);
    }

    //get all users
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> allUser=userService.getAll();
        return ResponseEntity.ok(allUser);
    }
}
