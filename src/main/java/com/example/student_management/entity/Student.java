package com.example.student_management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Jakarta Persistence API (JPA) provides the @GeneratedValue annotation to specify the generation strategy for the primary key.
    private Long id;

    @Column(name = "first_name", nullable = false)
    // Jakarta Persistence API (JPA) provides the @Column annotation to specify the column name in the database table.
    // default would be the field name
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    } 

    public String getLastName() {
        return lastName;
    }   

    public String getEmail() {
        return email;
    }   

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }   

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }   

    public void setEmail(String email) {
        this.email = email;
    }  

    
}
