package com.example.facebookapi.Service;

import com.example.facebookapi.Entity.Post;
import com.example.facebookapi.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PostService {

    PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post submitPost(Post body) {
        body.setPostID(UUID.randomUUID());
        Post post = postRepository.save(body);
        return post;
    }

    public List<Post> retrievePostFromDB() {
        List<Post> result = postRepository.findAll();
        return result;
    }

    public List<Post> deletePostFromDB(UUID postID) {
        postRepository.deleteById(postID);
        List<Post> result = retrievePostFromDB();
        return result;
    }
}
