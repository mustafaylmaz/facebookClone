package com.example.facebookapi.Controller;

import com.example.facebookapi.Entity.Status;
import com.example.facebookapi.Service.StatusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin

@RestController
@RequestMapping("/api/statusService")
public class StatusController {

    StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @PostMapping("/save")
    public Status saveStatus(@RequestBody Status status){
        return statusService.saveStatus(status);
    }
    @GetMapping("/getAllStatus")
    public List<Status> getAllStatus(){
        return statusService.getAllStatus();
    }
}
