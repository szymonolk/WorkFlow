package com.example.WorkFlow.models;

import com.example.WorkFlow.enums.TaskStatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "task")
@AllArgsConstructor
@NoArgsConstructor
public class TaskModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "task_id")
    @Getter
    private Long id;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private TaskStatusEnum status;

    @Getter
    @Setter
    private String taskName;
    @Getter
    @Setter
    private Boolean isCommited;

    @Getter
    @Setter
    @ManyToOne
    @JsonIgnore
    private BoardModel boardModel;

    @Override
    public String toString() {
        return "TaskModel{" +
                "id=" + id +
                ", status=" + status +
                ", taskName='" + taskName + '\'' +
                ", isCommited=" + isCommited +
                ", boardModel=" + boardModel +
                '}';
    }
}
