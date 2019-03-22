package pl.com.plane.ticket;

import java.util.Date;

public class Flight {
	private String nameOfPilot;
	private String dateOfDeparture;
	private String dateOfArrival;
	private Airport departureAirport;
	private Airport arrivalAirport;
	
	Flight(){
		nameOfPilot = "Jan Kowalski";
		dateOfDeparture = "2019-01-01";
		dateOfArrival = "2019-01-01";
		departureAirport = new Airport();
		arrivalAirport = new Airport();
	}
	Flight(String name, String dateD, String dateA, Airport depAirport, Airport arrAirport){
		nameOfPilot = name;
		dateOfDeparture = dateD;
		dateOfArrival = dateA;
		departureAirport = depAirport;
		arrivalAirport = arrAirport;
	}
}
