package RandomNumber;
import java.util.Random;

public class OddOrEvenOTP {
	
	void oddEven()
	{
		Random r1 = new Random();
		int res1 = r1.nextInt(10000);
		
		if(res1 % 2 != 0)
		{
			System.out.println("OTP is = "+res1);
			System.out.println("OTP is odd.");
		}
		else 
		{
			System.out.println("OTP is = "+res1);
			System.out.println("OTP is even.");
		}
	}

	public static void main(String[] args) {
		
		OddOrEvenOTP o1= new OddOrEvenOTP();
		o1.oddEven();

	}

}
