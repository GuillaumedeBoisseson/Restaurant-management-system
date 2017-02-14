import java.util.Calendar;



public class CreditCard{

	int expiryMonth;
	private int expiryYear;
	private String firstName;
	private String lastName;
	private String ccNumber;
	
	Calendar now = Calendar.getInstance();
	

	
	public CreditCard(int expiryMonth, int expiryYear, String firstName, String
			lastName, String ccNumber){
		
	this.expiryMonth = expiryMonth;
	this.expiryYear = expiryYear;
	this.firstName = firstName;
	this.lastName = lastName;
	this.ccNumber = ccNumber;
}
			

	public String formatExpiryDate() {
		String formattedExpiryDate = expiryMonth + "/" + expiryYear;
		System.out.println("Expiry date: " + formattedExpiryDate);
		return formattedExpiryDate;
	}

		
	public String formatFullName(){
		String formattedformatFullName = firstName + lastName;
		System.out.println("Account holder: " + firstName + " " + lastName);
		return formattedformatFullName;
	}
	
	public String formatCCNumber(){
		String formattedFormatCCNumber = ccNumber;
		System.out.println("Number: " + ccNumber);
		return formattedFormatCCNumber;
		
	}
	
		
	public boolean isValid() {

		int yearNow = now.get(Calendar.YEAR);
		int monthNow = now.get(Calendar.MONTH);
		boolean validity = false;
		
		
		if ((monthNow < expiryMonth) && (yearNow < expiryYear)){
			validity = true;
		}
		
		else if ((monthNow > expiryMonth) && (yearNow > expiryYear)){
			validity = false;
		}
		
		else if ((monthNow > expiryMonth) && (yearNow == expiryYear)){
			validity = false;
		}

		return validity;
	}
	
}
