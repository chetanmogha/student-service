package com.company.student.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.student.beans.Student;
import com.company.student.exception.StudentNotFoundException;
import com.company.student.service.StudentService;


/**
 * 
 * @author Chetan
 * @version 2.0
 * @see Student-Service Endpoints
 *
 */



@RestController
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/")
	public String sayHello() {
		return "service is up..";
	}
	
	@GetMapping("/student")
	public List<Student> getStudents() {
		return service.getAllStudents();
	}
     
	@PostMapping("/student")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		Student registerStudent = service.saveStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(registerStudent);

	}
	
	
	
	@PutMapping("/student/{id}")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student) throws StudentNotFoundException {
		if(service.getStudentById(student.getId()).isPresent()) {
			Student updateStudent = service.updateStudent(student);
			return ResponseEntity.status(HttpStatus.OK).body(updateStudent);
		} else {
			throw new StudentNotFoundException("Student Not Found to Update" + student.toString());
		}
	}

	@DeleteMapping("/student/{id}/")
	public ResponseEntity<?> deleteStudent(@PathVariable Integer id) {
		
		service.deleteStudent(id); 
		return ResponseEntity.status(HttpStatus.OK).body("Student Deleted " + id);
	} 
}