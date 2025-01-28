package com.example.student_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.student_management.entity.Student;
import com.example.student_management.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// Student student1 = new Student(null, "John","Doe","john@t-online.de");
		// studentRepository.save(student1);

		// Student student2 = new Student(null, "Marc","Maier","marc@t-online.de");
		// studentRepository.save(student2);
	}

}
