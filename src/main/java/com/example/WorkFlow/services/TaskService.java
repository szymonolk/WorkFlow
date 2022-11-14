package com.example.WorkFlow.services;

import com.example.WorkFlow.models.TaskModel;
import com.example.WorkFlow.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskModel createNewTask(TaskModel taskModel){
        System.out.println(taskModel.toString());
        return taskRepository.save(taskModel);
    }

    public List<TaskModel> findAll(){
        return taskRepository.findAll();
    }


}
