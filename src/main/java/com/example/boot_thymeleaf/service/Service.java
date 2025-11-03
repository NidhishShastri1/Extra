package com.example.boot_thymeleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.boot_thymeleaf.model.Student;
import com.example.boot_thymeleaf.repository.Repository;
@org.springframework.stereotype.Service
public class Service {
	@Autowired
	Repository repository;
	
	public String insertStudent(@ModelAttribute Student student) {
		repository.save(student);
		return "Student Inserted";
	}
	public List<Student> fetchStudents() {
		return repository.findAll();
	}
	public Optional<Student> fetchStudentsbyid( int sid) {
		return repository.findById(sid);
	}
	public String deletestudentbyid(int sid) {
		repository.deleteById(sid);
		return "deleted";
	}
	public String deletestudent() {
		repository.deleteAll();
		return "everything deleted";
	}
}
