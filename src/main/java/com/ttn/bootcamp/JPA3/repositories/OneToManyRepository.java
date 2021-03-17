package com.ttn.bootcamp.JPA3.repositories;

import com.ttn.bootcamp.JPA3.oneToMany.entities.AuthorOneToMany;
import org.springframework.data.repository.CrudRepository;

public interface OneToManyRepository extends CrudRepository<AuthorOneToMany,Integer> {
}
