package method;

public class Demo6 {
	
	 static void  smethod()
	{
		System.out.println("static method call");
	}
	
	void nsmethod()
	{
		System.out.println("non static method call");
	}

	public static void main(String[] args) {
		System.out.println("mms");
        smethod();
        
        Demo6 d1= new Demo6();
        d1.nsmethod();
        System.out.println("mme");
        
	}

}
