package pl.com.plane.ticket;

public class Airplane {

	private String brand;
	private String model;
	private int allSeatsEco = 100;
	private int allSeatsBusiness = 20;

	public int availableSeatsEco;
	public int availableSeatsBusiness;

	Airplane(String b, String m, int ecoS, int busS){
		brand = b;
		model = m;
		allSeatsEco = ecoS;
		allSeatsBusiness = busS;
	}
	Airplane(String b, String m){
		brand = b;
		model = m;
	}
}


