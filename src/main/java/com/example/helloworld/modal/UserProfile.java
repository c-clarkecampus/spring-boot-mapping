package com.example.helloworld.modal;

import jakarta.persistence.*;

@Entity
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String  firstName;
    private String lastName;
    private String phoneNumber;
    @OneToOne
    @JoinColumn(name="user_id")
    private User user;
}
