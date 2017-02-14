package Arrays;

import java.util.Arrays;

public class MylittleArray {

	public static void main(String [] args){
		
		int numbers [] = new int[20];
			
		numbers [0] = 1;
		
		for (int i = 0; i< numbers.length - 1; i++){
			numbers [i+1] = numbers[i]*2;
		
		}
		System.out.print(Arrays.toString(numbers));
		
	}
	
}
