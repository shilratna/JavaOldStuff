package method;

public class ReturnType {
	
	static int myMethod(int a ,int b){
		System.out.println("method with return type  int ");
		return (a+b);
	}
	
	double myMethod(double x, double y){
		System.out.println("Method with rturn type double ");
		return(x+y);
	}

	public static void main(String[] args) {
		int res1 = myMethod(5, 6);
		System.out.println("Addition int is ="+res1);
		
		ReturnType r1 = new ReturnType();
		double res2 =r1.myMethod(2.40, 5.67);
		System.out.println("Addition double is ="+res2);
		
		

	}

}
