package com.ttn.bootcamp.JPA3.repositories;

import com.ttn.bootcamp.JPA3.oneToOne.entities.BookOne;
import org.springframework.data.repository.CrudRepository;

public interface OneToOneRepository extends CrudRepository<BookOne, Integer> {
}
