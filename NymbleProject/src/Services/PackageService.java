package Services;

import java.util.List;

import Module.Activity;
import Module.Destination;
import Module.Package;
import Module.Passenger;
import Module.Type;

public class PackageService {

	public void addPassenger(Passenger pass, Package pack) {
		if (pack.getPassengerCapacity() <= 0) {
			System.out.println("\tCapacity is full for Package");
			return;
		}

		List<Activity> listOfActivitiesEnrolled = pass.getListOfActivitiesEnrolled();

		for (Activity act : listOfActivitiesEnrolled)
			act.setCapacity(act.getCapacity() - 1);

		pass.setListOfActivitiesEnrolled(listOfActivitiesEnrolled);
		pack.setPassengerCapacity(pack.getPassengerCapacity() - 1);
		List<Passenger> listofPass = pack.getListOfPassenger();
		listofPass.add(pass);
		pack.setListOfPassenger(listofPass);
		System.out.println("\tPassenger added Sucessfuly");

	}

	/*
	 * Print itinerary of the travel package including: 
	 * 1. travel package name,
	 * 2. destinations and details of the activities available at each destination,
	 *    like name, cost, capacity and description.
	 * 
	 */
	public void getItineraryDetails(Package packages) {
		List<Destination> listOfDest = packages.getListOfDestination();
		System.out.println("Name of package : " + packages.getName());
		int i = 1;
		for (Destination dest : listOfDest) {
			System.out.println(i + " Destination name is : " + dest.getName());
			for (Activity act : dest.getListOfActivities()) {
				System.out.println(" ");
				System.out.println("Activity name is " + act.getName());
				System.out.println("Activity Description is " + act.getDescription());
				System.out.println("Activity Cost is " + act.getCost());
				System.out.println("Activity Capacity is " + act.getCapacity());

			}
			i++;
		}
	}

	/*
	 * Print the passenger list of the travel package including: 
    1. package name, 
    2. passenger capacity, 
    3. number of passengers currently enrolled and 
    4. name and number of each passenger
	 */
	public void getPassengerList(Package packages) {
		List<Passenger> listOfPass = packages.getListOfPassenger();
		System.out.println("Name of package : " + packages.getName());
		System.out.println("Capacity of package : " + packages.getPassengerCapacity());
		System.out.println("Number of Passengers enrolled for package : " + listOfPass.size());
		System.out.println("\n List of Passengers : ");
		int i = 1;
		for (Passenger pass : listOfPass) {
			System.out.println(i + " Name of passenger " + pass.getName());
			System.out.println(" Number of passenger " + pass.getNumber());
			i++;
		}
	}
	
	/*
	 * Print the details of an individual passenger including their 
    1. name, 
    2. passenger number, 
    3. balance (if applicable), 
    4. list of each activity they have signed up for, including the destination the at which the activity is taking place and the price the passenger paid for the activity.
	 */

	public void getPassengerDetails(Passenger pass) {
		List<Activity> listOfActEnrolled = pass.getListOfActivitiesEnrolled();
		System.out.println("\n\nName of Passenger " + pass.getName());
		System.out.println("Number of Passenger  " + pass.getNumber());
		System.out.println("\tList of Activities Enrolled : ");
		int i = 1;
		for (Activity act : listOfActEnrolled) {
			int price = 0;
			if (pass.getType() == Type.STANDARD)
				price = act.getCost();
			else if (pass.getType() == Type.GOLD)
				price = act.getCost() - (act.getCost() / 10);
			else if (pass.getType() == Type.PREMIUM)
				price = 0;

			System.out.println(" ");
			System.out.println(i + " Activity name is " + act.getName());
			System.out.println("Cost paid for activity is " + price);
			i++;
		}
	}

	/*
	 * Print the details of all the activities that still have spaces available, including how many spaces are available.
	 */
	public void getActivitiesWithSpace(Package packages) {
		List<Destination> listOfDestinations = packages.getListOfDestination();
		for (Destination dest : listOfDestinations) {
			List<Activity> listOfact = dest.getListOfActivities();
			int i = 1;
			for (Activity activity : listOfact) {
				if (activity.getCapacity() > 0) {
					System.out.println("\n" + i + " Activity name is " + activity.getName());
					System.out.println("No of Spaces available " + activity.getCapacity());
					i++;
				}

			}
		}
	}
}
