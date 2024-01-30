package Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Module.Activity;
import Module.Destination;
import Module.Package;
import Module.Passenger;
import Module.Type;

public class MainService {

	public static void main(String[] args) {

		PackageService packageService = new PackageService();
		Scanner sc = new Scanner(System.in);

		// Creating 4 Activities
		Activity activity1 = new Activity("Footboll", "Playing footboll with team", 1200, 11);
		Activity activity2 = new Activity("GTA5", "Playing GTA5 game online", 1000, 5);
		Activity activity3 = new Activity("Chees", "Playing Chees with team", 800, 2);
		Activity activity4 = new Activity("Tracking", "HillStation tracking", 2000, 8);

		// Creating 2 Destinations
		Destination destination1 = new Destination("Laddak", List.of(activity1, activity2));
		Destination destination2 = new Destination("Lonavala", List.of(activity3, activity4));

		// Creating 4 Passengers
		Passenger passenger1 = new Passenger("Gaurav", 123456, Type.STANDARD, 12000, List.of(activity1, activity2));
		Passenger passenger2 = new Passenger("Ankur", 125556, Type.GOLD, 2000, List.of(activity1, activity2));
		Passenger passenger3 = new Passenger("Vishal", 1211156, Type.PREMIUM, 15000, List.of(activity3, activity4));
		Passenger passenger4 = new Passenger("Piyush", 1245456, Type.GOLD, 10000, List.of(activity3, activity4));

		// Creating 2 Packages
		Package package1 = new Package("Together", 20, List.of(destination1), new ArrayList<>());
		Package package2 = new Package("Smile", 10, List.of(destination2), new ArrayList<>());

		// Adding Passengers in respective packages
		packageService.addPassenger(passenger1, package1);
		packageService.addPassenger(passenger2, package1);
		packageService.addPassenger(passenger3, package2);
		packageService.addPassenger(passenger4, package2);

		boolean flag = true;
		while (flag) {
			System.out.println("\n\n\n\tEnter your choice from below : ");
			System.out.println("\t\t1. Print itinerary of the travel package ");
			System.out.println("\t\t2. Print the passenger list of the travel package ");
			System.out.println("\t\t3. Print the details of an individual passenger ");
			System.out.println(
					"\t\t4. Print the details of all the activities that still have spaces available, including how many spaces are available ");
			System.out.println(
					"\t\t5. Exit\n\n ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				packageService.getItineraryDetails(package1);
				System.out.println("\n");
				packageService.getItineraryDetails(package2);
				break;
			}
			case 2: {
				packageService.getPassengerList(package1);
				System.out.println("\n");
				packageService.getPassengerList(package2);
				break;
			}
			case 3: {
				packageService.getPassengerDetails(passenger1);
				packageService.getPassengerDetails(passenger2);
				packageService.getPassengerDetails(passenger3);
				packageService.getPassengerDetails(passenger4);
				break;
			}
			case 4: {
				packageService.getActivitiesWithSpace(package1);
				System.out.println("\n");
				packageService.getActivitiesWithSpace(package2);
				break;
			}
			case 5: {
				flag = false;
				break;
			}
			default:
				System.out.println("\n\t\t\tEnter correct choice..");
			}

		}
	}

}
