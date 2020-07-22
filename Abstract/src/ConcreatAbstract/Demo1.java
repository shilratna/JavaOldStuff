package ConcreatAbstract;

public abstract class Demo1 {
	 
	//complete method 
	void test()                                 //method declaration 
	{
		System.out.println("Running test ..."); //method definition
	}
	//incomplete method 
	abstract void view();
}


class Demo2 extends Demo1
{
	@Override
	void view() {
		System.out.println("running view ...");
	}
}

