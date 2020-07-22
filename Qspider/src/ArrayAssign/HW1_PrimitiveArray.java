package ArrayAssign;

public class HW1_PrimitiveArray {

	public static void main(String[] args) {
		//Declaration
		int arr[];
		
		//Instantiation
		int arr1[]=new int[4];
		
		//Initialization 
		arr1[0]=34;
		arr1[1]=45;
		arr1[2]=67;
		arr1[3]=54;
		
		//Usage
		System.out.println("arr[] =");
		for (int i=0;i<arr1.length;i++)
		{
		   System.out.print(arr1[i]+" ");
		}
		
		
		

	}

}
