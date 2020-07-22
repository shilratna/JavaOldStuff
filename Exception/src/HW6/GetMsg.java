package HW6;

public class GetMsg {

	public static void main(String[] args) {
		
		System.out.println("Main Method Started...");
         
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		System.out.println("Main method ended....");
	}

}
