class Demo1
{
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
     Demo1()
     {
     System.out.println("Running non-static Constructor...");
     }
   // main method 
   public static void main (String [] args)
   {
      System.out.println("main method started");
      
     //ClassName ref = new ClassName();
     Demo1 d1 = new Demo1();
     System.out.println(d1.x);
     d1.view();
      
  
      System.out.println("main method ended");
   }
}
