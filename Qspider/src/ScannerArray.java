import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
           
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of plane =");
		int plane =scan.nextInt();
		
		System.out.println("Enter the number of row =");
		int row =scan.nextInt();
		
		System.out.println("Enter the number of col. =");
		int col =scan.nextInt();
		
		int arr [][][] = new int[plane][row][col];
		
		//Initialize Values 
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter plane "+i+" Elements =");
			
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter Row "+j+" Elements =");
				
				for(int k=0;k<arr[i][j].length;k++)
				{
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		
		//Usage
         
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		

	}

}
