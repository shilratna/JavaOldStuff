/*Write a java program on nested try and catch block.*/
package HW5;

public class NestedTryCatch {
	
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=0;
		
		int arr[] = new int[3];
		
		try {
			System.out.println("Outer try start...");
			//c=a/b;  not recomanded
		
		
				try {
					System.out.println("Inner try Start...");
					arr[4]=22;
					System.out.println("Inner try end...");
				}
				catch(ArrayIndexOutOfBoundsException ar){
					System.out.println("AIOE handled in inner catch");
				}
				
		c = a/b;
		System.out.println("outer try end ...");
	    }
		catch(ArithmeticException ae ){
			System.out.println("AE handled in outer catch");
		}
		System.out.println("Division result is :"+c);
		System.out.println(".............................");
		
		System.out.println("Array elements are :");
		for(int i=0;i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}
		
		
}


