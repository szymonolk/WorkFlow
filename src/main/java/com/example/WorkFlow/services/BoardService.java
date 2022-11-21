package com.example.WorkFlow.services;

import com.example.WorkFlow.models.BoardModel;
import com.example.WorkFlow.models.TaskModel;
import com.example.WorkFlow.repositories.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public BoardModel createNewBoard(BoardModel boardModel){
        return boardRepository.save(boardModel);
    }

    public List<BoardModel> findAll(){
        return boardRepository.findAll();
    }




}
