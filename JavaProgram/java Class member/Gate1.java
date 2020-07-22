class Gate1
	{
	 //static data member 
     	static int a=10;

   	//static member function 
    	static void test()
    	{
      	 System.out.println("Running static method...");
    	}
//static block
static
   	{
      	System.out.println("Running static block...");
   	}
     	//non-static data member 
     	int x=55;

   	//non-static member function 
void view()
    	{
       	System.out.println("Running non-static method...");
    	}
//non-static block  
   	{
      	System.out.println("Running non-static block...");
   	}
// non-static constructor
     	Gate1()
     	{
     	System.out.println("Running non-static Constructor...");
     	}

   public static void main (String [] args)

	{

      	System.out.println("main method started");
      
	System.out.println(Gate1.a); // accesing static data member
	Gate1.test();

	//ClassName ref = new ClassName();
	Gate1 g1 = new Gate1();// object creation 
	System.out.println(g1.x);
	g1.view();

	Gate1 g2 = new Gate1();
	System.out.println(g2.x);
	g2.view();
  
	System.out.println("main method ended");

	}
}
