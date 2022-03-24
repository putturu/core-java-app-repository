package com.sapient.aem.exception;

public class EmployeeException extends Exception {
	private static final long serialVersionUID = 1L;
	public EmployeeException() {
		super("Employee Exception");
	}
	public EmployeeException(String message) {
		super(message);
	}
	public EmployeeException(String message,Throwable t) {
		super(message,t);
	}
	
}
