package com.cezarybek.java.rest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

//	@Autowired
//	public StudentService(StudentRepository studentRepository) {
//		this.studentRepository = studentRepository;
//	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
