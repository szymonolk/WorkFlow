package com.example.WorkFlow.models;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class CommentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}
