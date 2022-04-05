package com.company.student.exception;

public class LoginException extends Exception {

	/**
	*
	*/
	private static final long serialVersionUID = 1L;
	final private String message;

	public LoginException() {
		this.message = "User is not found! Please Try Again ";
	}

public LoginException(String msg)
{
this.message=msg;
}

public String message() {
return message;
}
}