package prototypePattern;

import java.util.ArrayList;

public class Flight implements Cloneable {
	
	private ArrayList<String> flightList;
	
	public Flight() {
		this.flightList = new ArrayList<String>();
	}
	
	public Flight(ArrayList<String> flightList) {
		this.flightList = flightList;
	}

	public void loadFlights() {
		flightList.add("IndiGo");
		flightList.add("Air India");
		flightList.add("TruJet");

	}
	
	public ArrayList<String> getFlightList(){
		return this.flightList;
	}
	
	public Flight clone() throws CloneNotSupportedException{
		 ArrayList<String> cloneFlightList = new ArrayList<String>();
		 for(String flights : this.getFlightList()) {
			 cloneFlightList.add(flights);
		 }
		 return new Flight(cloneFlightList);
		
	}
	
}
