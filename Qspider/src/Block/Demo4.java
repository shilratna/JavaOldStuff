package Block;

public class Demo4 {
	static int a=10;
	int b =20;
	
	static
	{
		System.out.println("Running 1st static of demo4");
		System.out.println(a);
		int a =22;
		a=44;
		Demo4 d4=new Demo4();
		System.out.println(d4.b);
		System.out.println(a);
		a=66;
		d4.b=88;
	
	}
	
	{
		System.out.println("Running 1st non-static of demo4");
		System.out.println(a);
		System.out.println(b);
		a=11;
		b=22;
	}

}
