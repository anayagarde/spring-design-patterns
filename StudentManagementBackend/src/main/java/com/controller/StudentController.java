package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.repository.StudentRepository;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/")
public class StudentController {
	
	@Autowired 
	StudentRepository studentrepository;
	
	//get all students
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentrepository.findAll();
	}

}
