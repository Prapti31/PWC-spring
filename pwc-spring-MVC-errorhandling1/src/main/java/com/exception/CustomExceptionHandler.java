package com.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CustomExceptionHandler {
	
	public ResponseEntity<Object> handleHeaderException(Exception ex,WebRequest request){
		List<String> details=new ArrayList<String>();
		details.add(ex.getLocalizedMessage());
		ErrorResponse response=new ErrorResponse("OOPS...header is missing",details);
		return new ResponseEntity(response,HttpStatus.BAD_REQUEST);
	}
}
