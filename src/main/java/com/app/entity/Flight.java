package com.app.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int flightNumber;
	public String airlineName;
	public String fromPlace;
	public String toPlace;
	public String startDate;
	public String endDate;
	public String instrument;
	public String meal;
	public int occupiedSeats;
	public int vacantSeats;
	
	Flight() {}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public int getOccupiedSeats() {
		return occupiedSeats;
	}

	public void setOccupiedSeats(int occupiedSeats) {
		this.occupiedSeats = occupiedSeats;
	}

	public int getVacantSeats() {
		return vacantSeats;
	}

	public void setVacantSeats(int vacantSeats) {
		this.vacantSeats = vacantSeats;
	}

	public Flight(int flightNumber, String airlineName, String fromPlace, String toPlace, String startDate,
			String endDate, String instrument, String meal, int occupiedSeats, int vacantSeats) {
		super();
		this.flightNumber = flightNumber;
		this.airlineName = airlineName;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.startDate = startDate;
		this.endDate = endDate;
		this.instrument = instrument;
		this.meal = meal;
		this.occupiedSeats = occupiedSeats;
		this.vacantSeats = vacantSeats;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", airlineName=" + airlineName + ", fromPlace=" + fromPlace
				+ ", toPlace=" + toPlace + ", startDate=" + startDate + ", endDate=" + endDate + ", instrument="
				+ instrument + ", meal=" + meal + ", occupiedSeats=" + occupiedSeats + ", vacantSeats=" + vacantSeats
				+ "]";
	}
	
	
	
}
