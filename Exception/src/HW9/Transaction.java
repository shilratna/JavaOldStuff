/*
 * Write a java program on creation custom exception 
 * event using custom exception class
 */
package HW9;

public class Transaction{
	
	int systemOTP = 1234;
	
	void makePayment(int userOTP) {
		
		if(systemOTP == userOTP){
			System.out.println("Transaction done Succesfully...");
		}
		else {
			throw new TransactionException();
		}
		System.out.println("Have a Wonderfull day...");
	}
}
