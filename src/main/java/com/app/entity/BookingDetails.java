/*
 * package com.app.entity;
 * 
 * import java.util.Date; import java.util.List;
 * 
 * import javax.persistence.Entity;
 * 
 * @Entity public class BookingDetails { String PNR; String email; Date
 * departureDateTime; Airline airlineName; Flight flight; int Price; int
 * numberOfSeats; List<Passenger> Passenger; public BookingDetails(String pNR,
 * String email, Date departureDateTime, Airline airlineName, Flight flight, int
 * price, int numberOfSeats, List<com.app.entity.Passenger> passenger) {
 * super(); PNR = pNR; this.email = email; this.departureDateTime =
 * departureDateTime; this.airlineName = airlineName; this.flight = flight;
 * Price = price; this.numberOfSeats = numberOfSeats; Passenger = passenger; }
 * public String getPNR() { return PNR; } public void setPNR(String pNR) { PNR =
 * pNR; } public String getEmail() { return email; } public void setEmail(String
 * email) { this.email = email; } public Date getDepartureDateTime() { return
 * departureDateTime; } public void setDepartureDateTime(Date departureDateTime)
 * { this.departureDateTime = departureDateTime; } public Airline
 * getAirlineName() { return airlineName; } public void setAirlineName(Airline
 * airlineName) { this.airlineName = airlineName; } public Flight getFlight() {
 * return flight; } public void setFlight(Flight flight) { this.flight = flight;
 * } public int getPrice() { return Price; } public void setPrice(int price) {
 * Price = price; } public int getNumberOfSeats() { return numberOfSeats; }
 * public void setNumberOfSeats(int numberOfSeats) { this.numberOfSeats =
 * numberOfSeats; } public List<Passenger> getPassenger() { return Passenger; }
 * public void setPassenger(List<Passenger> passenger) { Passenger = passenger;
 * }
 * 
 * @Override public String toString() { return "BookingDetails [PNR=" + PNR +
 * ", email=" + email + ", departureDateTime=" + departureDateTime +
 * ", airlineName=" + airlineName + ", flight=" + flight + ", Price=" + Price +
 * ", numberOfSeats=" + numberOfSeats + ", Passenger=" + Passenger + "]"; }
 * 
 * 
 * }
 */