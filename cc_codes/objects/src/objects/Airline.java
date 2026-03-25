package objects;

public class Airline {

	String airlineName ;
	String flightNumber ;
	String destination ;
	String departureTime ;
	int ticketPrice ;
	
	public void bookTicket() {
		System.out.println("Ticket can be booked online");
	}
	public void cancelTicket() {
		System.out.println("Ticket can becancled due to any urgent work");
	}
	public void checkFlightStatus() {
		System.out.println("Flight Status will be checked online");
	}
	public void announceBoarding() {
		System.out.println("The airport announced boarding for Air India Flight AI102");
	}
}




	
