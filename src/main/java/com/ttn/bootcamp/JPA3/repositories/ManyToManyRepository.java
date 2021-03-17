package com.ttn.bootcamp.JPA3.repositories;
import com.ttn.bootcamp.JPA3.manyToMany.entities.AuthorMtoM;
import org.springframework.data.repository.CrudRepository;

public interface ManyToManyRepository extends CrudRepository<AuthorMtoM,Integer> {
}