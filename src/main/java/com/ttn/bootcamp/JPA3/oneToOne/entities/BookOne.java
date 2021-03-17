package com.ttn.bootcamp.JPA3.oneToOne.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "bookone")
public class BookOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "bookname")
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private AuthorOne authorOne;
}
