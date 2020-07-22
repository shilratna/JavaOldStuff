package method;

public class Company {
	 static String companyName = " Wipro";
	 static int companyAge = 55;
	 
	 String employeName = "Samba";
	 int employeId = 62;
	 
	 static Company c1 = new Company();
	 
	 static void CompanyDetails ()
	 {
		 System.out.println("Company Details ");
		 System.out.println("Company Name = "+companyName);
		 System.out.println("Company Age = "+companyAge);
		 
	 }
	 
	 void EmployeDetails ()
	 {
		 System.out.println("Employe Details ");
		 System.out.println("Employee Name ="+c1.employeName);
		 System.out.println("Employee Id ="+c1.employeId);
	 }
	 
	 static void Details ()
	 {
		 System.out.println("Company and Employee Details");
		 System.out.println("Company Name = "+companyName);
		 System.out.println("Company Age = "+companyAge);
		 System.out.println("Employee Name ="+c1.employeName);
		 System.out.println("Employee Id ="+c1.employeId);
	 }

	public static void main(String[] args) {
	      //CompanyDetails();
	     //c1.EmployeDetails();
	     Details();

	}

}
