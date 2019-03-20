package pl.com.plane.ticket;

public class Airport {
 private String city;
 private String nameOfAirport;
 
	
	Airport()
 {
	 city = "Warsaw";
	 nameOfAirport = "Chopin Airport";
 }
	Airport(String c)
	{
		city = c;
	}
	Airport(String c,String n)
	{
		city = c;
		 nameOfAirport = n;
	}
 
 
}
