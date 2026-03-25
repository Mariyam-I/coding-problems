package objects;

public class AirlineDemo {

	public static void main(String[] args) {

		Airline a = new Airline();
		
		a.airlineName = "Air India" ;
		a.flightNumber = "AI102" ;
		a.destination = "New Delhi to Mumbai" ;
		a.departureTime = "10:30 AM IST " ;
		a.ticketPrice =  7500 ;
		
		System.out.println("Airline Name = " +a.airlineName);
		System.out.println("Flight Number = " +a.flightNumber);
		System.out.println("Destination = " +a.destination);
		System.out.println("Departure Time = " +a.departureTime);
		System.out.println("Ticket Price in rupees = " +a.ticketPrice);
		
		System.out.println("--------Methods Call--------");
		a.bookTicket();
		a.cancelTicket();
		a.checkFlightStatus();
		a.announceBoarding();
	}

}



/*
Airline Name = Air India
Flight Number = AI102
Destination = New Delhi to Mumbai
Departure Time = 10:30 AM IST 
Ticket Price in rupees = 7500
--------Methods Call--------
Ticket can be booked online
Ticket can becancled due to any urgent work
Flight Status will be checked online
The airport announced boarding for Air India Flight AI102
*/