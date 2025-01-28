package com.example.student_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student_management.entity.Student;

@Repository
// unnecessary to add @Repository annotation, but it is a good practice to add it.
public interface StudentRepository extends JpaRepository<Student, Long> {
    // implements the JpaRepository interface, which provides CRUD operations for the Student entity.
}
