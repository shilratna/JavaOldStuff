package RandomNumber;
import java.util.Random;

public class LargerEvenOdd {

			
			void larEvenOdd ()
			{
				Random r1 = new Random();
				int res1 = r1.nextInt(10000);
				
				Random r2 = new Random();
				int res2 = r2.nextInt(10000);
				
				
				if (res1 >= res2)
				{
					System.out.println("larger number is res1 = "+res1);
					
					if (res1 % 2 != 0)
					{
						System.out.println("random number r1 is odd ");
					}
					else 
					{
						System.out.println("Random number r1 is even ");
					}
				}
				else 
				{
					System.out.println("larger number is res2 = "+res2);
					if (res2 % 2 != 0)
					{
						System.out.println("random number r2 is odd ");
					}
					else 
					{
						System.out.println("Random number r2 is even ");
					}
				}
			
			}

			public static void main(String[] args) {
				
				LargerEvenOdd l1 = new LargerEvenOdd();
				l1.larEvenOdd();

			
	}

}
