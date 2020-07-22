package ArrayAssign;
import java.util.Scanner;

public class ScannerArrayAddition {

	public static void main(String[] args) {
		int sumrow = 0,sumcol =0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of rows =");
		int row =scan.nextInt();
		
		System.out.println("Enter the number of column =");
		int column = scan.nextInt();
		
		int arr[][]= new int[row][column];
		int arr1[][]= new int[row+1][column+1];
		
		//Declaration of Array
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println("Enter the row "+i+" Element");
			for(int j= 0;j<arr[i].length;j++)
			{
			   arr[i][j]=scan.nextInt();	
			}
		}
		//Usage of Array
		for(int i = 0;i<arr.length;i++)
		{
			
			for(int j= 0;j<arr[i].length;j++)
			{
			   System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
		
//************************************************************
		
		for(int i = 0;i<arr1.length;i++)
		{
			
			for(int j= 0;j<arr1[i].length;j++)
			{
			   arr1[i][j] =scan.nextInt();	
			}
			
		}
		
		for(int i = 0;i<arr1.length;i++)
		{
			
			for(int j= 0;j<arr1[i].length;j++)
			{
			   arr1[i][j] 
			}
			
		}
			  
			  
		
		
		

	}

}
