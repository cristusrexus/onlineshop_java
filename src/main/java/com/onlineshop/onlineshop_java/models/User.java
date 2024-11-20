package com.onlineshop.onlineshop_java.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="users")
@Data

public class User {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable=false)
    private String name;
    @Column(nullable=false)
    private String email;
    @Column(nullable=false)
    private String password;
    @Column(nullable=false)
    private String address;
    @Column(nullable=false)
    private String phone;
    @Column(nullable=false)
    private UserRole role;

    @Enumerated(value=EnumType.STRING)
    private UserRole userRole;

    @OneToMany(mappedBy = "customer")
    @JsonIgnoreProperties("customer")
    private List<Command> commandsList;


}
