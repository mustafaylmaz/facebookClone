package com.example.facebookapi.Controller;

import com.example.facebookapi.Entity.Post;
import com.example.facebookapi.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
@CrossOrigin
@RestController
@RequestMapping("/api/postService")
public class PostController {
    PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/save")
    public Post submitPost(@RequestBody Post body){
        Date date = new Date();
        long time = date.getTime();
        Timestamp dateTime = new Timestamp(time);

        body.setLikes(0);
        body.setDateTime(dateTime);
        Post result = postService.submitPost(body);
        return result;
    }

    @GetMapping("/getPost")
    public List<Post> allPosts(){
        List<Post> result = postService.retrievePostFromDB();
        return result;
    }
    @DeleteMapping("/delete/{postId}")
    public List<Post> deleteParticularPost(@PathVariable("postId") UUID postID){
        List<Post> result = postService.deletePostFromDB(postID);
        return result;
    }
}
