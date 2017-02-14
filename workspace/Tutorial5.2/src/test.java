


	class test {

		        public int x;
		 	public int y;
		        void cal(int a, int b){
		            x =  a + 1;
		            y =  b;
		        }        
		    }    
		    class access_specifier {
		        public static void main(String args[])
		        {
		            test obj = new test();   
		            obj.cal(2, 3);
		            System.out.println(obj.x + " " + obj.y);     
		        }
		   }
    
    
	

