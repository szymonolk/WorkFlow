package com.example.WorkFlow.controllers;

import com.example.WorkFlow.models.TaskModel;
import com.example.WorkFlow.services.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/task/")
@RestController
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("create")
    public TaskModel createNewTask(@RequestBody TaskModel taskModel){
        return taskService.createNewTask(taskModel);
    }

    @GetMapping("all")
    public List<TaskModel> findAll(){
        return taskService.findAll();
    }

}
