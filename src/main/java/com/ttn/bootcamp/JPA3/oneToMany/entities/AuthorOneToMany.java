package com.ttn.bootcamp.JPA3.oneToMany.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name = "author_one_to_many")
public class AuthorOneToMany {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<BookManyToOne> books;


    public void addBookName(BookManyToOne book) {
        if (book != null) {
            if (books == null) {
                books = new ArrayList<>();
            }
            book.setAuthor(this);
            books.add(book);
        }
    }

}

