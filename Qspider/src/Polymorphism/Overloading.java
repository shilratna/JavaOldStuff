/*1. Write a program on method overloading.*/

package Polymorphism;

public class Overloading {
	
	void add(int a,int b)
	{
		System.out.println("Addition of number ="+(a+b));
	}
	
	void add(double x,double y)
	{
		System.out.println("Multiplication of number ="+(x*y));
	}

	public static void main(String[] args) {
		
		Overloading o1 = new Overloading();
		o1.add(10,7);
		o1.add(10.4,4.5);

	}

}
