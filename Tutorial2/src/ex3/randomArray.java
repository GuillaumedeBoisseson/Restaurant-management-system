package ex3;

import java.util.ArrayList;
import java.util.Random;


public class randomArray {
	
	public static void main(String[] args){

		ArrayList<String> Alist = new ArrayList<String>(100);
		Random random = new Random();
		
		for (int i= 0; i<100; i++){
			
			Integer r = random.nextInt(100);
			String ra = Integer.toString(r);
			Alist.add(ra);

		}
		System.out.println("The 100 randomly generated numbers are: ");
		System.out.println(Alist);
		System.out.println("The sum of all even numbers is: ");
	
		if ()
	
	}
}
	


