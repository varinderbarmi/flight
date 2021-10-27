package com.app.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int flightNumber;
	String airineName;
	String fromPlace;
	String toPlace;
	Date startDate;
	Date endDate;
	String instrument;
	String meal;
	int occupiedSeats;
	int vacantSeats;
	public Flight(int flightNumber, String airineName, String fromPlace, String toPlace, Date startDate, Date endDate,
			String instrument, String meal, int occupiedSeats, int vacantSeats) {
		super();
		this.flightNumber = flightNumber;
		this.airineName = airineName;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.startDate = startDate;
		this.endDate = endDate;
		this.instrument = instrument;
		this.meal = meal;
		this.occupiedSeats = occupiedSeats;
		this.vacantSeats = vacantSeats;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirineName() {
		return airineName;
	}
	public void setAirineName(String airineName) {
		this.airineName = airineName;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
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
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", airineName=" + airineName + ", fromPlace=" + fromPlace
				+ ", toPlace=" + toPlace + ", startDate=" + startDate + ", endDate=" + endDate + ", instrument="
				+ instrument + ", meal=" + meal + ", occupiedSeats=" + occupiedSeats + ", vacantSeats=" + vacantSeats
				+ "]";
	}
	
}
