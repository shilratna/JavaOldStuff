package HW9;

public class TransactionException extends RuntimeException {

	@Override 
	public String getMessage()
	{
		return "Invalid OTP";
	}
	

		

}
