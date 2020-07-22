package RandomNumber;

import java.util.Random;

public class TwoNumberEvenOdd {
	 
	void TwoOddEven()
	{
		Random r1 = new Random();
		int res1 = r1.nextInt(10000);
		
		Random r2 = new Random();
		int res2 = r2.nextInt(10000);
		
		if(res1 % 2 != 0)
		{
			System.out.println("1st OTP is = "+res1);
			System.out.println("1st OTP is odd.");
		}
		else 
		{
			System.out.println("1st OTP is = "+res1);
			System.out.println("1st OTP is even.");
		}
		
		System.out.println("*******************************");
		
		if(res2 % 2 != 0)
		{
			System.out.println("2nd OTP is = "+res2);
			System.out.println("2nd OTP is odd.");
		}
		else 
		{
			System.out.println("2nd OTP is = "+res2);
			System.out.println("2nd OTP is even.");
		}
	}

	public static void main(String[] args) {
		
		TwoNumberEvenOdd o1= new TwoNumberEvenOdd();
		o1.TwoOddEven();

	}

}

	


