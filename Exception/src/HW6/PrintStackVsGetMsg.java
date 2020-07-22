package HW6;

public class PrintStackVsGetMsg {

	public static void main(String[] args) {
		
	       System.out.println("Main Method started ....");
	       
	       try {
	    	   System.out.println(10/0);
	       }
	       catch(ArithmeticException ae)
	       {
	    	   ae.printStackTrace();
	       }
	       System.out.println("Main Method Ended....");

	}

}
