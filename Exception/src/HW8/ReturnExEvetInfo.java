/*
 * Write a java program to return exception event information 
 * from user defined method to main method.
 */
package HW8;

public class ReturnExEvetInfo {
	
	ArithmeticException test()
	{
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("Exception Handled...");
			return ae;
		}
		return null;
	}

	public static void main(String[] args) {
		ReturnExEvetInfo r1= new ReturnExEvetInfo();
		ArithmeticException a1 = r1.test();
		
		if(a1 !=null)
		{
			a1.printStackTrace();
		}
		

	}

}
