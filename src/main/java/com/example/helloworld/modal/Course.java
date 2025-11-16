package com.example.helloworld.modal;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title;
    private String code;
    private Integer credits;
    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
}
