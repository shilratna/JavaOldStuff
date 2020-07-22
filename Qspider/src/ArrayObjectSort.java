import java.util.Arrays;

//1. Write a Java program to create array object and sort the elements.
public class ArrayObjectSort {

	public static void main(String[] args) {
		
		int arr1[] = {7,5,9,2,6};
		
		System.out.println("Array Element Before Sorting ");
		for(int i=0; i<=4; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		Arrays.sort(arr1);
		System.out.println();
		System.out.println("Array element After Sorting");
		for(int i=0; i<=4; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		

	}

}
