package com.example.boot_thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.boot_thymeleaf.model.Student;

public interface Repository extends JpaRepository<Student, Integer> {
	

}
