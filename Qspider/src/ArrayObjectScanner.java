import java.util.Scanner;

public class ArrayObjectScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number of element store in array");
		int size =scan.nextInt();
		System.out.println("Enter the "+size+" element");
		int arr[] = new int [size];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		
		System.out.println("Array elements are = ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
       scan.close();
	}

}
