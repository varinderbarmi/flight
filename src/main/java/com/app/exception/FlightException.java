package com.app.exception;


public class FlightException extends Exception{
	

	public FlightException() {
		super();
	}
	public FlightException(String s) {
		super(s);
	}
	public FlightException(Exception e) {
		super(e);
	}
	public FlightException(String s, Exception e) {
		super(s,e);
	}
	
}
