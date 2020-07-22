package Polymorphism;

public class EmpTest {

	public static void main(String[] args) {
		
		Emp e1 = new CompanyOne();
		e1.salaryDetails();
		
		Emp e2 = new CompanyTwo();
		e2.salaryDetails();
		
		Emp e3 = new CompanyThree();
		e3.salaryDetails();
		
		
		

	}

}
