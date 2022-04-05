package com.company.student.beans;

import org.springframework.data.annotation.Id;


/**
 * 
 * @author chetan
 * @version 2.0
 * @see Trainer bean class
 *
 */

public class Student {

	@Id
      private Integer id;
	
    private String firstName;
	 private String lastName;
	 private String course;
	 private String batch;
	 private String email;
	 private String mobile;
	 private String address;
     private String specialization;
	
	public Student() {
		
		
	}

	public Student(Integer id, String firstName, String lastName, String course, String batch, String email,
			String mobile, String address, String specialization) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.batch = batch;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.specialization = specialization;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
	
	
	
}
