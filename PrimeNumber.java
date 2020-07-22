import java.util.Scanner;
class PrimeNumber
{
public static void main(String[] args) {
	    
		Scanner sc = new Scanner (System.in);
                System.out.println("Enter the Number");
                int N =sc.nextInt();
        
         int temp =0;
        for(int i=1;i<=N;i++)
         {
           for(int j=2;j<=N-1;j++)
             {
                if(N % j == 0)
                {
                    temp = temp+1;
                }
              }
                if(temp == 0)
                {
                    System.out.print(i);
                }
                else 
	        {
		     temp=0;
		}
               
            }
        }
    }

