package com.example.helloworld.modal;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String position;
    private Double salary;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
