package com.example.WorkFlow.services;

import com.example.WorkFlow.models.BoardModel;
import com.example.WorkFlow.models.TaskModel;
import com.example.WorkFlow.repositories.BoardRepository;
import com.example.WorkFlow.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    private final BoardRepository boardRepository;

    public TaskService(TaskRepository taskRepository, BoardRepository boardRepository) {
        this.taskRepository = taskRepository;
        this.boardRepository = boardRepository;
    }

    public TaskModel createNewTask(TaskModel taskModel){
        System.out.println(taskModel.toString());
        return taskRepository.save(taskModel);
    }

    public List<TaskModel> findAll(){
        return taskRepository.findAll();
    }

    public void addTaskToBoard(Long boardId, Long taskId){
        Optional<BoardModel> board = boardRepository.findById(boardId);
        Optional<TaskModel> task = taskRepository.findById(taskId);
        if (task.isPresent() && board.isPresent()){
            board.get().getTaskModelLists().add(task.get());
            System.out.println(board.get().getTaskModelLists());
        }




    }


}
