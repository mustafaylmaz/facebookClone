package com.example.facebookapi.Repository;

import com.example.facebookapi.Entity.Status;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface StatusRepository extends CassandraRepository<Status, UUID> {
}
