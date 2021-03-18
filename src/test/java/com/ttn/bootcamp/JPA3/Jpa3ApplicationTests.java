package com.ttn.bootcamp.JPA3;

import com.ttn.bootcamp.JPA3.entities.Author;
import com.ttn.bootcamp.JPA3.entities.Book;


import com.ttn.bootcamp.JPA3.repositories.AuthorRepository;
import com.ttn.bootcamp.JPA3.repositories.OneToOneRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;


@SpringBootTest
class Jpa3ApplicationTests {
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private OneToOneRepository oneToOneRepository;


    @Test
    void contextLoads() {
    }

//    Uncomment when run for subject test
/*
    @Test
    public void testAuthorAndSubjectCreate() {
        Author author = new Author();
        author.setName("Brian Smith");
        Address address = new Address();
        address.setStreetNumber("1234 temporary street");
        address.setLocation("Seoul");
        address.setState("Korea");
        author.setAddress(address);

        Subject subject1 = new Subject();
        subject1.setSubjectName("Maths");

        Subject subject2 = new Subject();
        subject2.setSubjectName("English");

        Subject subject3 = new Subject();
        subject3.setSubjectName("Science");
        author.addSubjectName(subject1);
        author.addSubjectName(subject2);
        author.addSubjectName(subject3);
        authorRepository.save(author);
    }


 */

    @Test
    public void testOneToOneCreateBook() {
        Book bookOne = new Book();
        bookOne.setBookName("SpringBookOne");
        Author authorOne = new Author();
        authorOne.setName("Harry");
        authorOne.setAge(21);
        bookOne.setAuthorOne(authorOne);
        oneToOneRepository.save(bookOne);
    }

    @Test
    public void testOneToManyCreate() {
        Author author = new Author();
        author.setName("Ian Gilbert");

        Book book1 = new Book();
        book1.setBookName("English Fiction");

        Book book2 = new Book();
        book2.setBookName("Spring Data");

        author.addBookName(book1);
        author.addBookName(book2);
        authorRepository.save(author);
    }

    @Test
    public void testManyToManyCreate() {
        Author authorMtoM = new Author();
        authorMtoM.setName("Alex");
        HashSet<Book> bookSet = new HashSet<Book>();
        Book book = new Book();
        book.setBookName("CousreBook1");
        bookSet.add(book);
        authorMtoM.setBookMToM(bookSet);
        authorRepository.save(authorMtoM);

    }


}
