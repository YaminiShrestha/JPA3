package com.ttn.bootcamp.JPA3.oneToMany.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "book_one_to_many")
public class BookManyToOne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String bookName;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorOneToMany author;
}
