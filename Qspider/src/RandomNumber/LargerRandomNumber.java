package RandomNumber;
import java.util.Random;

public class LargerRandomNumber {
	
	void largerNumber ()
	{
		Random r1 = new Random();
		int res1 = r1.nextInt(10000);
		
		Random r2 = new Random();
		int res2 = r2.nextInt(10000);
		
		if (res1 >= res2)
		{
			System.out.println("larger number is res1 = "+res1);

			
		}
		else 
		{
			System.out.println("larger number is res2 = "+res2);
		}
	}

	public static void main(String[] args) {
		
		LargerRandomNumber l1 = new LargerRandomNumber();
		l1.largerNumber();

	}

}
