package com.hotel.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Create_account")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", allocationSize = 1, sequenceName = "USER_SEQ")
    private int id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String mobile;
    @Column
    private String gender;
    @Column
    private String type;

}
