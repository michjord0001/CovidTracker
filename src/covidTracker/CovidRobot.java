package covidTracker;

import java.io.*;

public class CovidRobot implements Serializable {

	private int size;
	private String name; 
	private String role;
	private boolean hasConnection;
	private boolean hasPower;
	private boolean hasInfection;
	private int coordinates;
	private String orientation;
	
	//Constructor
	public CovidRobot(String name, int size, boolean hasConnection, String role, boolean hasPower, boolean infStat, int coord, String orient) {
		this.size = size;
		this.name = name;
		this.hasConnection = hasConnection;
		this.role = role;
		this.hasPower = hasPower;
		this.hasInfection = hasInfection;
		this.coordinates = coord;
		this.orientation = orient;
        }

	public void display() {
		System.out.println("A Robot with name: " + name + " and size: " + size);
		System.out.println(" has the role: " + role +".");
		System.out.println(" The robot has power: " + ((hasPower)?"Yes":"No"));
		System.out.println(" The robot has a connection: " + ((hasConnection)?"Yes":"No"));
		System.out.println(" Is the robot infected: " + ((hasInfection)?"Yes":"No"));
		System.out.println(" The robot has location: " + coordinates + " and orientation: " + orientation);
	}
	
	public String getRobotName() {
		return this.name;
	}
	
	public int getRobotSize() {
		return this.size;
	}
	
	public String getRobotRole() {
		return this.role;
	}
	
	public CovidRobot getRobot() {
		CovidRobot robot1 = new CovidRobot("RoboDoc", 15 , true, "Medical Robot", true, false, 40, "North");
		return robot1;
	}
}
