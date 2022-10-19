package com.example.facebookapi.Controller;

import com.example.facebookapi.Entity.Comment;
import com.example.facebookapi.Service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@CrossOrigin

@RestController
@RequestMapping("/api/commentService")
public class CommentController {
    CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/save")
    public Comment saveComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }

    @GetMapping("/getAllComments/{postID}")
    public List<Comment> getAllComments(@PathVariable("postID") UUID postID){
        return commentService.getAllComment(postID);
    }
}
