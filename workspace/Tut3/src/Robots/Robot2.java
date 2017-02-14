package Robots;

import java.util.Random;

public class Robot2 extends Robot1 {

	private String [] sayings;
	
	public void setSayings (String[] sayings){
		this.sayings = sayings;
	}
	
	public void speak (){
		
		Random random = new Random();
		int index = random.nextInt(sayings.length);
		System.out.println(sayings[index]);
	}
	
}
