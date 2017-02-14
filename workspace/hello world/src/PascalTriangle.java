import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        
        int rows = 5;

        
        for(int i =0;i<rows;i++) {
            int number = 1;
            
            // following makes the shape of the triangle.
            // The following syntax is complex, as in order to determine the  place of the
            //triangle we insert: +(rows-i)*2+, which in fact is like "%2number s
            
            System.out.format("%"+(rows-i)*2+"s","");
            
            for(int j=0;j<=i;j++) {
            	System.out.format("%4d",number);
                 number = number * (i-j) / (1+j);
               
            }
            System.out.println();
        }
        
    }
}
