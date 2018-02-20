package com.example.demo.Model;


import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty
    @Column(unique = true)
    private String username;

    @NotEmpty
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    //This needs to be instantiated in the construtor so you can use it to add and remove individual roles
    private Set<AppRole> roles;
}
