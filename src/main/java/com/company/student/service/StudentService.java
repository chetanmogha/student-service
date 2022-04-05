package com.company.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.company.student.beans.Student;
import com.company.student.repo.StudentRepository;

/**
 * 
 * @author Chetan
 * @version 2.0
 * @see Student Service 
 *
 */

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student saveStudent(Student student) {
		studentRepository.insert(student);
		return student;
	}
	
	public Student updateStudent(Student student) {
		return studentRepository.save(student); 
	}

	public Optional<Student> getStudentById(Integer id) {
		return studentRepository.findById(id);
	}


		
	public List<Student> getAllStudents() {
		return studentRepository.findAll(); 
	}
	
	
	
	public void deleteStudent(Integer studentId) {
		studentRepository.deleteById(studentId);
	}
	

	



	
}
