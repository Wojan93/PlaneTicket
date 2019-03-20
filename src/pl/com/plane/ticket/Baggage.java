package pl.com.plane.ticket;

public class Baggage extends Passenger {
	
	private byte quantityOfSmallBaggage;
	private byte quantityOfRegisteredBaggage;
	private float height;
	private float width;
	private float length;
	
	Baggage(float h,float w, float l){
		height = h;
		width = w;
		length = l;
		quantityOfRegisteredBaggage = 1;
	}
	Baggage(float h,float w, float l, byte q){
		height = h;
		width = w;
		length = l;
		quantityOfRegisteredBaggage = q;
	}
	
}
