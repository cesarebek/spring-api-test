package com.cezarybek.java.rest.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return studentService.addNewStudent(student);
	}
	
	@GetMapping("api/v1/student/{id}")
	public Optional<Student> fetchStudentById(@PathVariable String id) {
		return studentService.getStudent(id);
	}

};
