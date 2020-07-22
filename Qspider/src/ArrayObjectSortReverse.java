import java.util.Arrays;

public class ArrayObjectSortReverse {
	
    public static void main(String[] args) {
		
		int arr1[] = {7,5,9,2,6};
		
		System.out.println("Array Element Before Sorting ");
		for(int i=0; i<=4; i++)
		{
			System.out.println(arr1[i]+" ");
		}
		
		Arrays.sort(arr1);
		System.out.println("Array element After Sorting");
		for(int i=0; i<=4; i++)
		{
			System.out.println(arr1[i]+" ");
		}
		
		System.out.println("Array element After reverse");
		for(int i=4; i>=0; i--)
		{
			System.out.println(arr1[i]);
		}

     }
}
