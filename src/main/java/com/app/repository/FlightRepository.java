package com.app.repository;

import com.app.entity.Flight;

import java.util.List;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer>{
	
	/*
	 * public List<Flight> findAll(){ return null; }
	 * 
	 * public Flight findById(int id) { return null; }
	 * 
	 * public Flight save(Flight f) { return null; }
	 */
	
	
	  
	  
	@Query(value="select * from Flight")
	public List<Flight> findAll();
	
	
	
	
}
