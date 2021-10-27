package com.app.service;

import com.app.entity.Flight;
import com.app.exception.FlightException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.persistence.Cacheable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
//import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.CacheEvict;



@ComponentScan("com.app")
@Service
public class FlightService {
	
	//@Autowired
	private com.app.repository.FlightRepository repo;
	
	public List<Flight> findAllFlights(){
		return repo.findAll();
	}
	
	//@Cacheable(key="#id", value="flightCache")
	public Flight findById(int id) throws FlightException{
		
		Optional<Flight> optional = repo.findById(id);
		if(optional.isEmpty()) {
			//System.out.println("Flight not found with "+ id);
			//return null;
			throw new FlightException("Flight not found with "+ id);
		}
		else {
			return optional.get();
		}
	}
	
	public Flight saveFlight(Flight f) {
		System.out.println(f);
		System.out.println("Saving flight: " + LocalDateTime.now());
		return repo.save(f);
	}
	
	//delete
	//@CacheEvict(key="#id", value="flightCache")
	
	
	//update
	//@CachePut(key="#id", value="flightCache")
	
}
