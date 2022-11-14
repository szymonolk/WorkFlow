package com.example.WorkFlow.models;

import lombok.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "board")
@AllArgsConstructor
@NoArgsConstructor
public class BoardModel {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "board_id")
    private Long id;

    @Setter
    @Getter
    private Boolean isActive;

    @Setter
    @Getter
    private String boardName;

    @Getter
    @Setter
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "boardModel")
    private List<TaskModel> taskModelLists = new ArrayList<TaskModel>();


}
