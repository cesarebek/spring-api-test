package com.cezarybek.java.rest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
//	@Autowired
//	public StudentController(StudentService studentService) {
//		this.studentService = studentService;
//	}

	@GetMapping
	public List<Student> fetchAllStudents() {
		return studentService.getAllStudents();
	}

}
