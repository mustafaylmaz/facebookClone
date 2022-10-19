package com.example.facebookapi.Repository;

import com.example.facebookapi.Entity.Comment;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface CommentRepository extends CassandraRepository<Comment, UUID> {
    @AllowFiltering
    List<Comment> findAllByPostID(UUID postID);

}
