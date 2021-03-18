package com.ttn.bootcamp.JPA3.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Data
@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

// uncomment when use address;
    /*
     @Embedded
       private Address address;
       @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
       private List<Subject> subjects;

     */
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books;

    private int age;

    @OneToOne(mappedBy = "authorOne")
    private Book bookOne;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "authors_books",
            joinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"))
    private Set<Book> bookMToM;

    //    uncomment when check ques 3
    /*
  public void addSubjectName(Subject subject) {
        if (subject != null) {
            if (subjects == null) {
                subjects = new ArrayList<>();
            }
            subject.setAuthor(this);
            subjects.add(subject);
        }

    }
     */
    public void addBookName(Book book) {
        if (book != null) {
            if (books == null) {
                books = new ArrayList<>();
            }
            book.setAuthor(this);
            books.add(book);
        }
    }
}



