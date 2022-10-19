package com.example.facebookapi.Controller;

import com.example.facebookapi.Entity.User;
import com.example.facebookapi.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/userService")
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public User saveUserMetaData(@RequestBody User user){
        return userService.submitMetaDataOfUser(user);
    }

    @GetMapping("/getUserDetails")
    public List<User> getAllUserDetails(){
        return userService.retrieveAllUserDetails();
    }

    @GetMapping("/getAllUsers/{userID}")
    public Optional<User> getUserDetail(@PathVariable("userID")String userID){
        return userService.getUserData(userID);
    }
}
