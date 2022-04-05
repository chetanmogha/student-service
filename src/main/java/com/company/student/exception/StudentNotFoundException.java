package com.company.student.exception;



/**
 * 
 * @author chetan
 * @version 2.0
 * @see Custom Exception For Student
 *
 */

public class StudentNotFoundException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private final String msg;

	public StudentNotFoundException() {
		this.msg = "User not found";
	}

	public StudentNotFoundException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "StudentNotFoundException " + msg ;
	}	
	

}
