package com.ttn.bootcamp.JPA3.oneToOne.entities;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "authorone")
public class AuthorOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    @OneToOne(mappedBy = "authorOne")

    private BookOne bookOne;
}
