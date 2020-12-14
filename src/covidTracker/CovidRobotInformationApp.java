package covidTracker;

public class CovidRobotInformationApp {
	
	public int safetyMargin = 2; //2 metres
	
	public static void main(String[] args) {
		//String name, int size, boolean hasConnection, String role, boolean hasPower, boolean infStat, int coord, String orient) {
						
		CovidRobot robot2 = new CovidRobot("RoboCook", 20 , true, "Kitchen Robot", true, false, 50, "West");
		CovidRobot robot3 = new CovidRobot("RoboPost", 35 , true, "Delivery Robot", true, false, 60, "South");
		CovidRobot robot4 = new CovidRobot("RoboChill", 10 , true, "Entertainment Robot", true, false, 70, "East");
		CovidRobot robot5 = new CovidRobot("RoboCop", 45 , true, "Security Robot", true, false, 80, "North-East");
		
		robot2.display();
	}
	
	public boolean isSafeDistance(CovidRobot r1, CovidRobot r2) {
		if ((r1.getCoords() - r2.getCoords()) < (r1.getRobotSize() + r2.getRobotSize() + safetyMargin)){
			return false;
		}
		else {
			return true;
		}
	}
}
