package Block;

public class TestDome4{
	static int x;
	int y;
	
	{
        System.out.println("Running non-static block of main method ");
		System.out.println(x);
		System.out.println(y);
		
		int x=30;
		x=Demo4.a;
		System.out.println(x);
		y=Demo4.a;
	}
	
	static
	{
		System.out.println("Running static of main class");
		System.out.println(x);
		x=66;
		TestDome4 t4= new TestDome4();
		System.out.println(t4.y);
		x=99;
		t4.y=66;
		int b=11;
		Demo4 d4 = new Demo4();
		System.out.println(d4.b);
		d4.b =b;
		System.out.println(b);
		System.out.println(d4.b);
	}

	public static void main(String[] args) {
		System.out.println("mms");
		System.out.println(x);
		System.out.println(Demo4.a);
		TestDome4 t4= new TestDome4();
		System.out.println(t4.y);
		Demo4 d4 = new Demo4();
		System.out.println(d4.b);
		System.out.println("mme");
		
		

	}

}
