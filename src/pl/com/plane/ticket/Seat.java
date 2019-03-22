package pl.com.plane.ticket;

public class Seat {
	
	private String typeOfSeat;
	private int rowNo;
	private int seatNo;
	private boolean smallBaggagePlace;
	private ClassOfJourney seatClass;
	private Passenger seatOwner;

	Seat(String type, int row, int seat, boolean sBaggagePlace, ClassOfJourney seatC, Passenger seatOw) {
		typeOfSeat = type;;
		rowNo = row;
		seatNo = seat;
		smallBaggagePlace = sBaggagePlace;
		seatClass = seatC;
		seatOwner = seatOw;
		
	}

}
