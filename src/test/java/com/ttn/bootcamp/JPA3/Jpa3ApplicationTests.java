package com.ttn.bootcamp.JPA3;

import com.ttn.bootcamp.JPA3.entities.Address;
import com.ttn.bootcamp.JPA3.entities.Author;
import com.ttn.bootcamp.JPA3.entities.Book;
import com.ttn.bootcamp.JPA3.manyToMany.entities.AuthorMtoM;
import com.ttn.bootcamp.JPA3.manyToMany.entities.BookMToM;
import com.ttn.bootcamp.JPA3.oneToMany.entities.AuthorOneToMany;
import com.ttn.bootcamp.JPA3.oneToMany.entities.BookManyToOne;
import com.ttn.bootcamp.JPA3.repositories.OneToManyRepository;
import com.ttn.bootcamp.JPA3.repositories.OneToOneRepository;
import com.ttn.bootcamp.JPA3.repositories.ManyToManyRepository;
import com.ttn.bootcamp.JPA3.oneToOne.entities.AuthorOne;
import com.ttn.bootcamp.JPA3.oneToOne.entities.BookOne;
import com.ttn.bootcamp.JPA3.repositories.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

@SpringBootTest
class Jpa3ApplicationTests {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private ManyToManyRepository manyToManyRepository;
    @Autowired
    private OneToOneRepository oneToOneRepository;
    @Autowired
    private OneToManyRepository oneToManyRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testAuthorAndSubjectCreate() {
        Author author = new Author();
        author.setName("Brian Smith");
        Address address = new Address();
        address.setStreetNumber("1234 temporary street");
        address.setLocation("Seoul");
        address.setState("Korea");
        author.setAddress(address);

        Book book1 = new Book();
        book1.setName("Maths");

        Book book2 = new Book();
        book2.setName("English");

        Book book3 = new Book();
        book3.setName("Science");

        author.addSubjectName(book1);
        author.addSubjectName(book2);
        author.addSubjectName(book3);
        authorRepository.save(author);
    }


    @Test
    public void testOneToOneCreateBook() {
        BookOne bookOne = new BookOne();
        bookOne.setName("SpringBookOne");
        AuthorOne authorOne = new AuthorOne();
        authorOne.setName("Harry");
        authorOne.setAge(21);
        bookOne.setAuthorOne(authorOne);
        oneToOneRepository.save(bookOne);
    }

    @Test
    public void testOneToManyCreate() {
        AuthorOneToMany author = new AuthorOneToMany();
        author.setName("Ian Gilbert");

        BookManyToOne book1 = new BookManyToOne();
        book1.setBookName("English Fiction");

        BookManyToOne book2 = new BookManyToOne();
        book2.setBookName("Spring Data");

        author.addBookName(book1);
        author.addBookName(book2);
        oneToManyRepository.save(author);
    }

    @Test
    public void testManyToManyCreate() {
        AuthorMtoM authorMtoM = new AuthorMtoM();
        authorMtoM.setName("Alex");
        HashSet<BookMToM> bookSet = new HashSet<BookMToM>();
        BookMToM book = new BookMToM();
        book.setName("CousreBook1");
        bookSet.add(book);
        authorMtoM.setBookMToM(bookSet);
        manyToManyRepository.save(authorMtoM);

    }


}
