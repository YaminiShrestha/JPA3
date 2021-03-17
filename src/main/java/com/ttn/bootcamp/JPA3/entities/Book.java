package com.ttn.bootcamp.JPA3.entities;

import lombok.Data;

import javax.persistence.*;

@Data
//@Entity
public class Book {

    private int id;
    private String name;
    private Author author;
}
