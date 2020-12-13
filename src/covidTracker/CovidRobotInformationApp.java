package covidTracker;

public class CovidRobotInformationApp {

	public static void main(String[] args) {
				//String name, int size, boolean hasConnection, String role, boolean hasPower, boolean infStat, int coord[], String orient) {
				
		CovidRobot robot1 = new CovidRobot("Robot 1", 15 , true, "Medical Robot", true, false, 40, "North");
		CovidRobot robot2 = new CovidRobot("Robot 2", 15 , true, "Kitchen Robot", true, false, 50, "West");
		CovidRobot robot3 = new CovidRobot("Robot 3", 15 , true, "Delivery Robot", true, false, 60, "South");
		CovidRobot robot4 = new CovidRobot("Robot 4", 15 , true, "Entertainment Robot", true, false, 70, "East");
		CovidRobot robot5 = new CovidRobot("Robot 5", 15 , true, "Dance Robot", true, false, 80, "North-East");
		
		robot1.display();
	}

}


