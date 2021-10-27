package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Flight;
import com.app.service.FlightService;

@Controller
@RestController
@ComponentScan("com.app")
@RequestMapping("/flights")
public class FlightController {
	
	@Autowired
	public FlightService service;
	
	@GetMapping("/all")
	public List<Flight> allFlights(){
		return service.findAllFlights();
	}
	
	@GetMapping("/{flightNumber}")
	public Flight findFlightsById(@PathVariable int flightNumber) throws Exception{
		return service.findById(flightNumber);
	}
	
	@PostMapping("")
	public Flight persist(@RequestBody Flight flight) {
		return service.saveFlight(flight);
	}
	
	
}



