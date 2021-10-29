package com.app.controller;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Flight;
import com.app.exception.FlightException;
import com.app.repository.FlightRepository;
import com.app.service.FlightService;

@RestController
@RequestMapping(path="/api/flights")
public class FlightController {
	
	@Autowired
	public FlightService service;
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Flight> getallFlights(){
		return service.findAllFlight();
	}
	
 
	@GetMapping("/error") 
	public String error() { return "error"; }
	
	 	
	@GetMapping("/{id}")
	@Cacheable(key="#id", value="flightCache")
	public Flight findFlightsById(@PathVariable int id) throws FlightException{
		return service.findById(id);
	}
	
	@PostMapping("")
	public Flight persist(@RequestBody Flight flight) {
		return service.saveFlight(flight);
	}
	
	
	@PostMapping(path="/add") // Map ONLY POST Requests
	public Flight addNewFlight(@RequestBody Flight f)
	{   	    
	    return service.saveFlight(f);
	}
	
}	




