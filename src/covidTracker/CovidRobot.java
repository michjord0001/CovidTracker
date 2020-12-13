package covidTracker;

import java.awt.Point;

@SuppressWarnings("serial")
public class CovidRobot {

	private int size;
	private String name; 
	private String role;
	private boolean hasConnection;
	private boolean hasPower;
	private boolean hasInfection;
	public Point coordinates;
	private String orientation;
	
	public CovidRobot(String name, int size, boolean hasConnection, String role, boolean hasPower, boolean infStat, String orient) {
		this.size = size;
		this.name = name;
		this.hasConnection = hasConnection;
		this.role = role;
		this.hasPower = hasPower;
		this.hasInfection = hasInfection;
		this.coordinates = new Point ((int)(Math.random()*(500)),(int)(Math.random()*(500))); //Assign random location on canvas to start
		this.orientation = orient;
        }
	
	public void display() {
		System.out.println("A Robot with name: " + name + " and size: " + size);
		System.out.println(" has the role: " + role +".");
		System.out.println(" The robot has power: " + ((hasPower)?"Yes":"No"));
		System.out.println(" The robot has a connection: " + ((hasConnection)?"Yes":"No"));
		System.out.println(" Is the robot infected: " + ((hasInfection)?"Yes":"No"));
		System.out.println(" The robot has location X=" + (int)coordinates.getX() + " and Y=" + (int)coordinates.getY() );
		System.out.println(" The robot has orientation: " + orientation);
	}
}
