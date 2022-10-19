package com.example.facebookapi.Service;

import com.example.facebookapi.Entity.Comment;
import com.example.facebookapi.Repository.CommentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class CommentService {

    CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment saveComment(@RequestBody Comment comment) {
        Date date = new Date();
        long time = date.getTime();
        Timestamp dateTime = new Timestamp(time);

        comment.setCommentID(UUID.randomUUID());
        comment.setTimestamp(dateTime);
        return commentRepository.save(comment);
    }

    public List<Comment> getAllComment(UUID postID){
        return commentRepository.findAllByPostID(postID);
    }
}
