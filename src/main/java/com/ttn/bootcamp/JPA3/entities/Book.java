package com.ttn.bootcamp.JPA3.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "book")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String bookName;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "authorone_id")
    private Author authorOne;

    @ManyToMany(mappedBy = "bookMToM")
    private Set<Author> authorMToM;
}
