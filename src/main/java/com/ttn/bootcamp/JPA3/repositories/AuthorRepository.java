package com.ttn.bootcamp.JPA3.repositories;

import com.ttn.bootcamp.JPA3.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Integer> {
}
