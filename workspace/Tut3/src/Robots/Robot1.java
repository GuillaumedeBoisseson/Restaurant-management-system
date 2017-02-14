package Robots;

public class Robot1 {

double batteryCharge = 5.0; // instance variable

	
	public void batteryReCharge (double d) {

		batteryCharge += d;	
		System.out.println("The battery level is: " + batteryCharge);
	
	}

	
	public void move(int distance) {
		
		int counter = 1;
		
		while (batteryCharge >= 0.5 && distance > 0) {
			batteryCharge -= 0.5;
			distance -= 1;
			System.out.print("[" + counter + "]" + " ");
			counter++;
		}
		
		if (batteryCharge == 0) {
			System.out.println("Out of power!");
		}
	}
}
