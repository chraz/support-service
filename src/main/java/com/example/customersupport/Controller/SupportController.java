package com.example.customersupport.Controller;

import com.example.customersupport.CustomerSupportApplication;
import com.example.customersupport.Model.SupportTask;
import com.example.customersupport.Repository.SupportRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SupportController {

    private static Logger logger = LoggerFactory.getLogger(SupportController.class);

    @Autowired
    private SupportRepository supportrepository;


    @GetMapping("/tasks")
    public List<SupportTask> getTasks() {
        return supportrepository.findAll();
    }

    @GetMapping("/tasks/{customerId}")
    public List<SupportTask> getTasks(@PathVariable long customerId) {
        var supportTasks = supportrepository.findByCustomerId(customerId);
        logger.info("supportTasks by customer"+customerId);

        return supportTasks;

    }

    @PostMapping("/task")
    public void addTask(@RequestBody SupportTask supportTask) {
        supportrepository.save(supportTask);
    }


    @PutMapping("/task")
    public void updateTask(@RequestBody SupportTask supportTask) {
        supportrepository.save(supportTask);
    }


    @DeleteMapping("/task/{customerId}")
    public void deleteTasks(@PathVariable long customerId){
        supportrepository.deleteByCustomerId(customerId);
        logger.info("deleted"+customerId);
        }


}

