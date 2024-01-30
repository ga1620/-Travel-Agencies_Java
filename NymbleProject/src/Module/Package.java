package Module;

import java.util.List;

public class Package {

	private String name;
	private int passengerCapacity;
	private List<Destination> listOfDestination;
	private List<Passenger> listOfPassenger;
	
	
	
	public Package() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Package(String name, int passengerCapacity, List<Destination> listOfDestination,
			List<Passenger> listOfPassenger) {
		super();
		this.name = name;
		this.passengerCapacity = passengerCapacity;
		this.listOfDestination = listOfDestination;
		this.listOfPassenger = listOfPassenger;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	public List<Destination> getListOfDestination() {
		return listOfDestination;
	}
	public void setListOfDestination(List<Destination> listOfDestination) {
		this.listOfDestination = listOfDestination;
	}
	public List<Passenger> getListOfPassenger() {
		return listOfPassenger;
	}
	public void setListOfPassenger(List<Passenger> listOfPassenger) {
		this.listOfPassenger = listOfPassenger;
	}
	

	@Override
	public String toString() {
		return "Package [name=" + name + ", passengerCapacity=" + passengerCapacity + ", listOfDestination="
				+ listOfDestination + ", listOfPassenger=" + listOfPassenger + "]";
	}
}
