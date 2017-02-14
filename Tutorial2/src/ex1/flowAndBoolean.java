package ex1;

import java.util.Scanner;

public class flowAndBoolean {

	static int number;
	static boolean validity = false;
	
	public static void main(String[] args){
	
	System.out.println("Select a number");
	Scanner scanner = new Scanner(System.in);
	number = scanner.nextInt();
	System.out.println("You selected the number: " + number + 
			". It is " + isEven(number) + " that this number is even!");
	}

	public static boolean isEven (int number) {
		
		return(number % 2 ==0) ? true:false;
}
}