package com.example.facebookapi.Repository;

import com.example.facebookapi.Entity.Post;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface PostRepository extends CassandraRepository<Post, UUID> {


}
