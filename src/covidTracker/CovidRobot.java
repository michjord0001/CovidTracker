package covidTracker;

public class CovidRobot {

	private String name; 
	private int size;
	private boolean hasConnection;
	private String role;
	private boolean hasPower;
	private boolean hasInfection;
	
	public CovidRobot(String name, int size, boolean hasConnection, String role, boolean hasPower, boolean infStat) {
		this.name = name;
		this.size = size;
		this.hasConnection = hasConnection;
		this.role = role;
		this.hasPower = hasPower;
		this.hasInfection = hasInfection;
        }
	
	public void display() {
		System.out.println("A Robot with name: " + name + " and size: " + size);
		System.out.println(" has the role: " + role +".");
		System.out.println(" The robot has power: " + ((hasPower)?"Yes":"No"));
		System.out.println(" The robot has a connection: " + ((hasConnection)?"Yes":"No"));
		System.out.println(" Is the robot infected: " + ((hasInfection)?"Yes":"No"));
	}
}
