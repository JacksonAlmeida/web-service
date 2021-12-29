package com.sunsystem.webservice.servicies.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id= "+ id);
	}
}
