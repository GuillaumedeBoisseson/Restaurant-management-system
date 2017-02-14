package ex1;

public class RemoveArray {

	public static void main(String [] args){	
		String[] array = {"The ", "quick ", "brown ", "fox ", "jumps ",
				"over ", "the ", "lazy ", "dog."};


		int deleteElement = 8; // delete the word 7, or element 7+1=8
		int newSize; // size of modified array 
		int n = 9; // Size of original array
		
		// for c = the element to delete - 1, ala c < array.length - 1, c++
		// as long as the element to delete - 1 < size of array:
		for (newSize = deleteElement - 1; newSize< n-1; newSize++)
		// array of size c gains 1 in size at each iteration
			array[newSize] = array[newSize+1];
		
		//for c = 0, ala c<array.length, c++
		for (newSize = 0; newSize< n - 1; newSize++)
		//Print element c at each iteration of c++, starting at 0 to array.size
		System.out.print(array[newSize]);
	}	
}

