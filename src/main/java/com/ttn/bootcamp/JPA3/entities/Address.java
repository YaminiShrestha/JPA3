package com.ttn.bootcamp.JPA3.entities;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Address {
    private String streetNumber;
    private String location;
    private String state;
}
