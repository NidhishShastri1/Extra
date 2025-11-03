package com.example.boot_thymeleaf.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.boot_thymeleaf.model.Student;
import com.example.boot_thymeleaf.service.Service;

import jdk.jfr.MemoryAddress;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	Service service;
	
	@GetMapping("/ih")
	public String insertHtml() {
		return "insert";
	}
	
	@PostMapping("/insert")
	@ResponseBody
	public String insertStudent(@ModelAttribute Student student) {
		return service.insertStudent(student);
	}
	@GetMapping("/fall")
	@ResponseBody
	public List<Student> fetchStudents() {
		return service.fetchStudents();
	}
	@GetMapping("/fid")
	@ResponseBody
	public Optional<Student> fetchStudentsbyid(int sid) {
		return service.fetchStudentsbyid(sid);
	}
	@GetMapping("/del")
	@ResponseBody
	public String deletestudentbyid(int sid) {
		return service.deletestudentbyid(sid);
	}
	@GetMapping("/dall")
	@ResponseBody
	public String deletestudent() {
		return service.deletestudent();
	}
}
