package com.example.facebookapi.Service;

import com.example.facebookapi.Entity.User;
import com.example.facebookapi.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User submitMetaDataOfUser(User user){
        Date date = new Date();
        long time = date.getTime();
        Timestamp dateTime = new Timestamp(time);

        user.setActive(true);
        user.setJoiningDate(dateTime);
        return userRepository.save(user);
    }
    public List<User> retrieveAllUserDetails(){
        List<User> users = userRepository.findAll();
        return users;
    }

    public Optional<User> getUserData(String userID){
        return userRepository.findById(userID);
    }

}
