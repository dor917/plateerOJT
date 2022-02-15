package com.hotel.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Admin {
    @Id
    private Integer id;
    private String username;
    private String password;
}
