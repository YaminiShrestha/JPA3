package com.ttn.bootcamp.JPA3.repositories;

import com.ttn.bootcamp.JPA3.entities.Book;

import org.springframework.data.repository.CrudRepository;

public interface OneToOneRepository extends CrudRepository<Book, Long> {
}
