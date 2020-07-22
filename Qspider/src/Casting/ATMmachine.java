/*
 * 4. Write a Java program on ATM amount withdrawal operation. 
 *    Where casting should be achieved. 
 *    Display the withdrawal amount (Design a receipt).
 */
package Casting;

public class ATMmachine {
	
	double amount;
	double totalAmt;
	
	void Withdrawal (double amount)
	{
		System.out.println("Withdraw amount is "+amount);
		totalAmt = totalAmt - amount;
		System.out.println("total amount is "+totalAmt);
	}
	

	public static void main(String[] args) {
		

	}

}
