
import java.util.Scanner;

public class Robot1 extends main{

	public class Main {

	}

	private double batteryCharge = 5.0; // instance variable
	
	public void batteryReCharge(double c) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("How much do you want to recharge the battery?");
		double batteryReCharge = Scanner.nextDouble();
		batteryCharge += batteryReCharge;	
		System.out.println("The battery level is:" + batteryCharge);
	}
	
	public void move(int distance) {
		System.out.println("The battery charge is" + batteryCharge+ 
				"What distance do you want to make?");
		Scanner Scanner = new Scanner(System.in);
		distance = Scanner.nextInt();
		
		if (distance >= 2 * batteryCharge){
			for (int i = 0; i<distance; i++){
					batteryCharge -= 0.5;
					}
		}
		else if (distance <= 2* batteryCharge){
			System.out.println("The battery is not charged enough for this distance");
		}
		
		System.out.println("You have moved" + distance + "The battery level is:" + batteryCharge);		
		
	}
}
