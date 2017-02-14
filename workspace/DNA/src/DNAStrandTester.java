
public class DNAStrandTester extends DNAStrand {



	public static void main (String [] args){
		DNAStrand dna = new String {A-}
	}
	
	public static void summarise(DNAStrand dna) {
		System.out.println("Original DNA Sequence: " + dna);
		if (dna.isValidDNA()) {
		System.out.println("Is valid");
		System.out.println("Complement: " + dna.complementWC());
		System.out.println("WC Palindrome: " + dna.palindromeWC());
		} else {
		System.out.println("Not Valid DNA");
		}
		}
	
}
