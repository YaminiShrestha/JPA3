package com.ttn.bootcamp.JPA3.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Embedded
    private Address address;
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books;


    public void addSubjectName(Book book) {
        if (book != null) {
            if (books == null) {
                books = new ArrayList<>();
            }
            book.setAuthor(this);
            books.add(book);
        }
    }
}



