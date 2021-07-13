package com.cezarybek.java.rest.api;

import java.util.List;
import java.util.Optional;

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
	
	public Student addNewStudent(Student student) {
		return studentRepository.insert(student);
	}
	
	public Optional<Student> getStudent(String id) {
		return studentRepository.findById(id);
	}

}
