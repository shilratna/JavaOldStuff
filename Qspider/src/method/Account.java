package method;

public class Account {
	  static double bankBalance;
	  double accBalance;
	  
	  void OpenAccount(String name)
	  {
		  
		  System.out.println("Account Holder name  = "+name);
		  
	  }
	  
	  void Deposit(double depositAmt)
	  {
		  System.out.println("Deposit Amount is = "+depositAmt);
		  accBalance = accBalance + depositAmt;
		  bankBalance = bankBalance + depositAmt;
	  }
	  void Withdraw(double withdrawAmt)
	  {
		  if (accBalance > withdrawAmt)
		  {
		  System.out.println("Withdraw Amount is ="+withdrawAmt);
		  accBalance = accBalance - withdrawAmt;
		  bankBalance = bankBalance - withdrawAmt;
		  }
		  else 
		  {
			  System.out.println("Balance is low cant withdraw");
		  }
	  }
	  void CheckBalance()
	  {
		  System.out.println("Account Balance is = "+accBalance);
		  
	  }

	public static void main(String[] args) {
		
		Account samba = new Account();
		
		System.out.println(" Bank Account information ");
		samba.OpenAccount("Samba");
		samba.CheckBalance();
		samba.Deposit(10000);
		samba.CheckBalance();
		samba.Withdraw(12000);
		samba.CheckBalance();
		//System.out.println("Bank Balance is = "+Account.bankBalance);
		
		
		System.out.println(" ************************************************** ");
		
		
		System.out.println(" Bank Account information ");
		Account dinga = new Account();
		dinga.OpenAccount("Dinga");
		dinga.CheckBalance();
		dinga.Deposit(50000);
		dinga.CheckBalance();
		dinga.Withdraw(10000);
		dinga.CheckBalance();
		
		System.out.println(" ************************************************** ");
		System.out.println(" ");
		System.out.println("Bank Balance is = "+Account.bankBalance);
		

	}

}
