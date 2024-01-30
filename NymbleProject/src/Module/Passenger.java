package Module;

import java.util.List;

public class Passenger {

	private String name;
	private int number;
	private Type type;
	private int balance;
	private List<Activity> listOfActivitiesEnrolled;
	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Passenger(String name, int number, Type type, int balance, List<Activity> listOfActivitiesEnrolled) {
		super();
		this.name = name;
		this.number = number;
		this.type = type;
		this.balance = balance;
		this.listOfActivitiesEnrolled = listOfActivitiesEnrolled;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

	public List<Activity> getListOfActivitiesEnrolled() {
		return listOfActivitiesEnrolled;
	}



	public void setListOfActivitiesEnrolled(List<Activity> listOfActivitiesEnrolled) {
		this.listOfActivitiesEnrolled = listOfActivitiesEnrolled;
	}



	@Override
	public String toString() {
		return "Passenger [name=" + name + ", number=" + number + ", type=" + type + ", balance=" + balance
				+ ", listOfActivitiesEnrolled=" + listOfActivitiesEnrolled + "]";
	}
	
	
}
