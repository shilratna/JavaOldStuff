package HW1;
/*Write a java program to perform Exception propagation operation.*/

public class Calculator {
	
	void add(int a,int b)
	{
		System.out.println("running add(arg)method....");
		System.out.println("Add result is :"+(a+b));
	}
	void div(int a,int b)
	{
		System.out.println("running div(arg)method....");
		System.out.println("Div result is :"+(a/b));
		add(a,b); //not get exicuted 
	}
	void sub(int a,int b)
	{
		System.out.println("running sub(arg)method....");
		System.out.println("Sub result is :"+(a-b));
		div(a,b);
	}

}
