/*1. Write a Java program on Narrowing and Widening.
 * 1.Widening(Auto or implicit)
 * 2.Narrowing(Explicit)
 */
package Casting;

public class NarrowingAndWidning {

	public static void main(String[] args) {
		
	//Widening (Auto or implicit)
		int a=10;  //4 byte
		System.out.println(a); //10
		double b=a; //8 byte
		System.out.println(b); //10.0
		
		System.out.println(".........................");
		
	//Narrowing (Explicit /force Casting)
		double x = 6.5;  //8 byte
		System.out.println(x); //6.5
		int y= (int)x;   //4 byte
		System.out.println(y); //6

	}

}
