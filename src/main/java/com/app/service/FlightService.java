

package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.app.entity.Flight;
import com.app.exception.FlightException;
import com.app.repository.FlightRepository;

@Service
public class FlightService {

	@Autowired
	private FlightRepository repo;
	
	public List<Flight> findAllFlight(){
		return repo.findAll();
	}
	
	@Cacheable(key="#id", value="flightCache")
	public Flight findById(int id) throws FlightException {
		Optional<Flight> optional = repo.findById(id);
		if(optional.isEmpty()) {
			 throw new FlightException("Exception Raised : Flight is not found in database with id "+id);
		} else {
			return optional.get();
		}
	}
	
	public Flight saveFlight(Flight m) {
		return repo.save(m);
	}
}



