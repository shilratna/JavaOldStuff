package HW2;
/*Write a java program to avoid exception propagation.*/

public class CalculatorHandleEx {
	
	void add(int a,int b){
		System.out.println("Running add(arg) method .... ");
		System.out.println("Add result is :"+(a+b));
	}
	
	void div(int a,int b){
		System.out.println("Running div(arg) method....");
		
		try {
			System.out.println("Div result is :"+(a/b));
		}
		catch(ArithmeticException ae) {
			System.out.println("AE handle in div stack");
		}
		add(a,b);
		
	}
	void sub(int a,int b) {
		System.out.println("Running sub(arg) method .... ");
		System.out.println("Sub result is :"+(a-b));
		div(a,b);
	}

}
