package Module;

public class Activity {

	private String name;
	private String description;
	private int cost;
	private int capacity;
	
	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Activity(String name, String description, int cost, int capacity) {
		super();
		this.name = name;
		this.description = description;
		this.cost = cost;
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Activity [name=" + name + ", description=" + description + ", cost=" + cost + ", capacity=" + capacity
				+ "]";
	}
	
	
	
}
