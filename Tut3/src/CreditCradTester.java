
public class CreditCradTester{

	public calculation (int addition, int substraction){
		
	}
	
	public static void main (String [] args){

	CreditCard cc1 = new CreditCard(12, 20, "Bob", "Jones",
			"1234 5678 9012 3456");
	
	cc1.formatCCNumber();
	cc1.formatExpiryDate();
	cc1.formatFullName();
	System.out.println("It is " + cc1.isValid() + " that your credit card is valid.");
	
}
}
