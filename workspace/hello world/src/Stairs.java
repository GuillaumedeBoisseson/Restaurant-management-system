

public class Stairs {
	
	public static void main(String [] args){
		int n;
		int i;
		int j;
		
		for (n = 0; n<6; n++){
		
			
		for (i = 6-n; i>0; i--){
			System.out.print(" ");
		}
		
		for (j = 5-n; j<6; j++){
			System.out.print("#");
		}
		
		System.out.println();
		}
	}	
}
