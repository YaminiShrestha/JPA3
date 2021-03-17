package com.ttn.bootcamp.JPA3.manyToMany.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "bookmany")
public class BookMToM {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @ManyToMany(mappedBy = "bookMToM")
    private Set<AuthorMtoM> authors;
}
