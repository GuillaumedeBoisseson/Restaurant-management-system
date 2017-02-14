package ex1;

// there are two ways of removing one or more elements of an array: 
// using a loop OR a System.arraycopy() Method


/*
 * 
 * import java.util.Arrays;
 * 
 *  public class ArrayCopyTest {
 *  
 *  
public static void main(String[] args) {

 // Have an array with 5 elements 
  * int[] data = {1, 2, 3, 4, 5 };
// Expand the data array to 7 elements int[] eData = expandArray(data, 7);
// Truncate the data array to 3 elements int[] tData = expandArray(data, 3);
 * 
System.out.println("Using for-loop...");
System.out.println("Original Array: " + Arrays.toString(data)); 
System.out.println("Expanded Array: " + Arrays.toString(eData)); 
System.out.println("Truncated Array: " + Arrays.toString(tData));

// Copy data array to new arrays 
 * eData = new int[9]; tData = new int[2];

System.arraycopy(data, 0, eData, 0, 5);
System.arraycopy(data, 0, tData, 0, 2);
 * 
 * 
 * System.out.println("Using System.arraycopy() method..."); 
 * System.out.println("Original Array: " + Arrays.toString(data)); 
 * System.out.println("Expanded Array: " + Arrays.toString(eData)); 
 * System.out.println("Truncated Array: " + Arrays.toString(tData));
}
 */
 

public class ArrayElementRemoval {

	public static void main(String[] args) {
		
		String [] array = {"The ", "quick ", "brown ", "fox ", "jumps ",
				"over ", "the ", "lazy ", "dog."};
		
		int i = 8; //original size of array
		int j = 7; //element to remove from array
		int c  =0; // count 
		
		for ( c= j; c< i ; c++)
		array[c] = array [c+1];
		
		for (c = 0; c< i; c++)
		 System.out.print(array[c]);
	} 
}
	
