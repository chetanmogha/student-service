package com.company.student;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.company.student.beans.Student;
import com.company.student.controller.StudentController;
import com.company.student.exception.StudentNotFoundException;
import com.company.student.repo.StudentRepository;
import com.company.student.service.StudentService;



@SpringBootTest
class StudentServiceApplicationTests {
	@Autowired
	private StudentService service;

	@Autowired
	private StudentController controller;

	@MockBean
	private StudentRepository repo;

	@BeforeEach
	public void setUp() {
		Optional<Student> Student = Optional
				.of(new Student(1001,"Chetan","Rajput","MCA","2019-22","chetan@gmail.com","19992112","Janakpuri","Java Stack Developer"));
		
		
		
		List<Student> list = Arrays
				.asList(new Student(1001,"Chetan","Rajput","MCA","2019-22","chetan@gmail.com","19992112","Janakpuri","Java Stack Developer"));
		
		
		Optional<Student> emptyStudent = Optional.empty();
		// mocked object
		when(repo.findById(1)).thenReturn(Student);
		when(repo.findById(11111)).thenReturn(emptyStudent);
		when(repo.findAll()).thenReturn(list);
		when(repo.insert(Student.get())).thenReturn(Student.get());

	}



	@Test
	@DisplayName("get all the Students and list should give you an array of 1 Student")
	public void getAllStudents() {
		// checking the service method
		assertEquals(1, service.getAllStudents().size());

		// checking the controller method
		assertEquals(1, controller.getStudents().size());
	}

	@Test
	@DisplayName("save the valid Student and acknowledge the same")
	public void saveStudentToTheServer() {
		Student student = new Student(1001,"Chetan","Rajput","MCA","2019-22","chetan@gmail.com","19992112","Janakpuri","Java Stack Developer");
		
		//checking the service method
		Student student1 = service.saveStudent(student);
		assertNotNull(student1);
		
		//checking the controller method
		 assertEquals(ResponseEntity.status(HttpStatus.CREATED).body(student),controller.saveStudent(student));
		 
	}
	
	@Test
	@DisplayName("check connection")
	public void checkConnection() {
		assertEquals("service is up..", controller.sayHello()); 
	}


}
