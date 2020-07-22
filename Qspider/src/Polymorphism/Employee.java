/*3. Write a program to achieve Compile time polymorphism.*/

package Polymorphism;

public class Employee {
	
	

	void search(int id )
	{
		System.out.println("Employe id is :"+id);
	}
	
	void search(String name)
	{
		System.out.println("Employee Name is :"+name);
	}
	
	void search(double contactNo)
	{
		System.out.println("Employee contact number is :"+contactNo);
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.search(11);
		e1.search(123456.89);
		//e1.search(samba,123);

	}

}
