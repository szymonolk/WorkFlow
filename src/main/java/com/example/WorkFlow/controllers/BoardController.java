package com.example.WorkFlow.controllers;

import com.example.WorkFlow.models.BoardModel;
import com.example.WorkFlow.services.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/board/")
@RestController
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("create")
    public BoardModel boardModel(@RequestBody BoardModel boardModel){
        return boardService.createNewBoard(boardModel);
    }
    @GetMapping("all")
    public List<BoardModel> findAll(){
        return boardService.findAll();
    }
}
