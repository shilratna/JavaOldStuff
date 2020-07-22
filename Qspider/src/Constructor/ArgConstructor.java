package Constructor;

public class ArgConstructor {
	int x;
	int y;
	
	ArgConstructor(int num1,int num2){
		this.x = num1;
		this.y = num2;
	}
	
	void detail()
	{
		System.out.println(x);
		System.out.println(y);
		int add = x + y;
		System.out.println(add);
	}
	

	public static void main(String[] args) {
	
		ArgConstructor a1 = new ArgConstructor(10,20);
		a1.detail();

	}

}
