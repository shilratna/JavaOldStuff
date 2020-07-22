/* Write a java program to show difference between 
 * Generic exception handler and Specific exception handler.*/
package HW3;

public class GenericException {
	
  public static void main(String[] args) {
	
	  int a = 10;
	  System.out.println("a value is :"+a);
	  
	  int b = 0;
	  System.out.println("b value is :"+b);
	  
	  int c = 0;
	  try {
		  System.out.println("try started ....");
		  c = a/b;
		  System.out.println("try Ended ....");
	  }
	  catch(Exception e){
		  System.out.println("Exception Handled.....");
		  }
	  
	  System.out.println("c value is :"+c);
     }
	

}
