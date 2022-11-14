package com.example.WorkFlow.repositories;

import com.example.WorkFlow.models.BoardModel;
import com.example.WorkFlow.models.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<BoardModel, Long> {
}
