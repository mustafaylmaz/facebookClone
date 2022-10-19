package com.example.facebookapi.Entity;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;
import java.util.UUID;

@Table
public class User {

    @PrimaryKey
    private String userID;

    private String userName;


    private String userImage;

    private boolean active;

    private Timestamp joiningDate;

    public User() {
    }

    public User(String userID, String userName, String userImage, boolean active, Timestamp joiningDate) {
        this.userID = userID;
        this.userName = userName;
        this.userImage = userImage;
        this.active = active;
        this.joiningDate = joiningDate;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Timestamp getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Timestamp joiningDate) {
        this.joiningDate = joiningDate;
    }
}
