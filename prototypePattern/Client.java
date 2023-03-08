package prototypePattern;

import java.util.ArrayList;

public class Client {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Flight flight = new Flight();
		flight.loadFlights();
		
		Flight morningFlights = (Flight) flight.clone();
		ArrayList<String> morningFlightsList = morningFlights.getFlightList();
		morningFlightsList.add("EMirates Air");
		
		Flight nightFlights = (Flight) flight.clone();
		ArrayList<String> nightFlightsList = nightFlights.getFlightList();
		nightFlightsList.remove("TruJet");
		
		System.out.println("FlightList "+flight.getFlightList());
		System.out.println("MorningFlightList "+morningFlights.getFlightList());
		System.out.println("NightFlightList "+nightFlights.getFlightList());
		System.out.println("FlightList "+flight.getFlightList());

		
	}

}
