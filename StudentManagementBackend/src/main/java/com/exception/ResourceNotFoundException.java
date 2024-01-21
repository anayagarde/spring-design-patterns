package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	//whenever a record is not present in system, REST API will throw this exception
	// we have used ResponseStatus annotation, so API will return NOT FOUND response to client
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String message) {
		super(message);
	}

}
