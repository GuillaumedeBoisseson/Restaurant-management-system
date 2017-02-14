package dna;
import java.util.*; //For Arrays and ArrayList

public class DNAStrand {
	
	private String data;
	
	public DNAStrand(String data) {
		this.data = data;
	}
	
	public boolean isValidDNA() {
		
		String[] split_string = data.split("-");
		String[] possibleChars = {"A", "T", "C", "G"};
		int counter = 0; 
		
		for (String i : split_string) {
			for (String j : possibleChars) {
				if ( i.equals(j) ) {
					counter++;
				}
			}
		}
		
		// checks to see that exact amount of valid items are present
		
		if (counter == split_string.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String complementWC() {
		
		String[] split_string = data.split("-");
		
		for (int i = 0; i < split_string.length; i++) {
			switch (split_string[i]) {
			case "A":
				split_string[i] = "T";
				break;
			case "T":
				split_string[i] = "A";
				break;
			case "C":
				split_string[i] = "G";
				break;
			case "G":
				split_string[i] = "C";
				break;
			default: 
				break;
			}
		}
		
		String concat = "";
		
		for (String i : split_string) {
			concat += i; 
		}
		
		return concat;
	}
	
	
	// Returns the Watson Crick Palindrome, which
	// is the reversed sequence of the complement.
	
	public String palindromeWC() {
		
		String[] split_string = data.split("-");
		int length = split_string.length;
		int counter = 0;
		String[] reversed = new String[length];
		
		for (int i = length - 1; i >= 0; i--) {
			reversed[counter] = split_string[i];
			counter++;
		}
		
		String concat = "";
	
		for (String i : reversed) {
			concat += i; 
		}
		
		return concat;
	}
	
	// Returns true if the DNA
	// contains the subsequence seq.
	
	public boolean containsSequence(String seq) {
		
		ArrayList<String> aList = new ArrayList<>();
		String[] split_string = data.split("-");
		String concat = "";
		
		for (String i : split_string) {
			concat += i;
		}
	
		for (int from = 0; from < concat.length(); from++) {
	        for (int to = from + 1; to <= concat.length(); to++) {
	            aList.add(concat.substring(from, to));
	        }
	    }
		
		for (String i : aList) {
			if (seq.equals(i)) {
				System.out.println("There is a matching substring: " +  i);
				return true;
			}
		}
		System.out.println("There are no matching substrings in this array");
		return false;
	}
	
	public String toString() {
		System.out.println(data);
		return data;
	}
}