package com.app.advices;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.app.dto.ErrorMessage;
//import com.app.entity.Flight;
import com.app.exception.FlightException;

@ControllerAdvice
public class ExceptionAdvice {
	
	@ExceptionHandler(FlightException.class)
	public ResponseEntity<ErrorMessage> handleFlightException(FlightException e){ 
		return new ResponseEntity<ErrorMessage>(
				new ErrorMessage(e.getMessage(),500,LocalDateTime.now()), 
				HttpStatus.OK
				);
	}
	
}
