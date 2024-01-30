package Module;

import java.util.List;

public class Destination {

	private String name;
	private List<Activity> listOfActivities;
	
	public Destination() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Destination(String name, List<Activity> listOfActivities) {
		super();
		this.name = name;
		this.listOfActivities = listOfActivities;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Activity> getListOfActivities() {
		return listOfActivities;
	}

	public void setListOfActivities(List<Activity> listOfActivities) {
		this.listOfActivities = listOfActivities;
	}

	@Override
	public String toString() {
		return "Destination [name=" + name + ", listOfActivities=" + listOfActivities + "]";
	}
	
	
	
	
}
