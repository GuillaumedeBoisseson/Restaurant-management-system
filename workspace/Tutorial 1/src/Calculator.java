import java.util.Scanner;

public class Calculator {
	
int a;
int b;

	public static void main (String[] args){
		
		System.out.println("Select the number of the operation you want to make:"
				+ "1. Addition " 
				+ "2. Substraction "
				+ "3. Multiplication "
				+ "4. Division ");
		

		Calculator addition = new Calculator();
		
		
		Scanner scanner = new Scanner (System.in);
		int choice = scanner.nextInt();
		
		if (choice == 1){
			Calculator.addition();	
		}
		else if (choice == 2){
			Calculator.substraction();
		}
	
		else if (choice == 3){
			Calculator.multiplication();
		}

		else if (choice == 4){
			Calculator.division();
		}
	}
	
	public static void addition(){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int result = a+b;
		System.out.println("the result of your calculation is:" + result);	
	}
	
	public static void substraction(){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int result = a-b;
		System.out.println("the result of your calculation is:" + result);	
	}
	
	public static void multiplication(){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int result = a*b;
		System.out.println("the result of your calculation is:" + result);	
	}
	
	public static void division(){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int result = a%b;
		System.out.println("the result of your calculation is:" + result);	
	}
}
