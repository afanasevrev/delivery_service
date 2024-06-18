package com.example.admins_page.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "admins")
public class AdminsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    public AdminsEntity() {}
    public AdminsEntity(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
