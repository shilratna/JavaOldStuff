import java.util.*;

public class ArrayObjectScannerEO {

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
			System.out.println(arr[i]);
			
		}
		
		System.out.println("***********************************");
		
		for(int i=0; i<arr.length;i++) 
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println(arr[i]+" is even number");
			}
			else 
			{
				System.out.println(arr[i]+" is odd number ");
			}
		}
		Arrays.sort(arr);
		System.out.println("***********************************");
		
		System.out.println("Sorted element =");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
       scan.close();
	}

}

