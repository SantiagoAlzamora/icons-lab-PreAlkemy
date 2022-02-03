package com.alkemy.icons.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.alkemy.icons.error.NoValidParamException;


@RestControllerAdvice
public class HandlerExceptionController extends ResponseEntityExceptionHandler{

	@ExceptionHandler(value = {NoValidParamException.class})
	protected ResponseEntity<Object> handlerInvalidParamException(Exception e, WebRequest request){
		return handleExceptionInternal(e,e.getMessage(),new HttpHeaders(),HttpStatus.BAD_REQUEST,request);
	}
	
	
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException e, HttpHeaders headers, WebRequest request){
		String error= e.getBindingResult().getFieldError().getDefaultMessage();
		return handleExceptionInternal(e,error,headers,HttpStatus.BAD_REQUEST,request);
		
	}
}
