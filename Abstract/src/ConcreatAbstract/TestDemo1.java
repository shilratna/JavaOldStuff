package ConcreatAbstract;

 public class TestDemo1
	{
		public static void main(String[] args) {
			
			Demo2 d2 = new Demo2();
			d2.test();
			d2.view();
			
			System.out.println("...............................");
			Demo1 d1 = new Demo2();
			d1.test();
			d1.view();
		}
	}

