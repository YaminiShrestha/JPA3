package com.ttn.bootcamp.JPA3.entities;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String subjectName;

    @ManyToOne
    @JoinColumn(name = "authorId")
    private Author author;
}
