package com.example.facebookapi.Entity;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;
import java.util.UUID;

@Table
public class Comment {
    @PrimaryKey
    private UUID commentID;

    private UUID postID;
    private UUID userID;

    private String comment;
    private Timestamp timestamp;

    public Comment() {
    }

    public Comment(UUID commentID, UUID postID, UUID userID, String comment, Timestamp timestamp) {
        this.commentID = commentID;
        this.postID = postID;
        this.userID = userID;
        this.comment = comment;
        this.timestamp = timestamp;
    }

    public UUID getCommentID() {
        return commentID;
    }

    public void setCommentID(UUID commentID) {
        this.commentID = commentID;
    }

    public UUID getPostID() {
        return postID;
    }

    public void setPostID(UUID postID) {
        this.postID = postID;
    }

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
