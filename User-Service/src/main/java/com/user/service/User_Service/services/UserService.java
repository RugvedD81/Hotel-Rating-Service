package com.user.service.User_Service.services;

import com.user.service.User_Service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    //user operations

    //create
    User saveUser(User user);

    //get all users
    List<User> getAll();

    //get user by id
    User getUser(String userId);



}
