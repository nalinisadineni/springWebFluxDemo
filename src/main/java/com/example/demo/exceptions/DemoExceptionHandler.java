package com.example.demo.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class DemoExceptionHandler {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		Map<String,String> result = new HashMap();
		ex.getBindingResult().getFieldErrors().forEach(error ->{ result.put(error.getField(), error.getDefaultMessage());});
		return result;
	}
}
