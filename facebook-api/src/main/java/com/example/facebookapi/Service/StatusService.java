package com.example.facebookapi.Service;

import com.example.facebookapi.Entity.Status;
import com.example.facebookapi.Repository.StatusRepository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class StatusService {
    StatusRepository statusRepository;

    public StatusService(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    public Status saveStatus(Status status){
        Date date = new Date();
        long time = date.getTime();
        Timestamp dateTime = new Timestamp(time);

        status.setStatusID(UUID.randomUUID());
        status.setUploadTime(dateTime);
        return statusRepository.save(status);

    }

    public List<Status> getAllStatus(){
        return statusRepository.findAll();
    }
}
