package com.example.springdatajpa.services.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.springdatajpa.errorreponse.ErrorResponse;

//@ControllerAdvice
@RestControllerAdvice
public class EmployeeControllerAdvice {

	@ExceptionHandler(EmployeeNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public  ErrorResponse handleResourceNotFound(final EmployeeNotFoundException exception,
	//public @ResponseBody ErrorResponse handleResourceNotFound(final EmployeeNotFoundException exception,
			final HttpServletRequest request) {
		ErrorResponse error = new ErrorResponse();

		error.setMessageBody(exception.getMessage());
		error.setUri(request.getRequestURI());
		//error.setId(HttpStatus.NOT_FOUND.toString());
		return error;
	}
}
