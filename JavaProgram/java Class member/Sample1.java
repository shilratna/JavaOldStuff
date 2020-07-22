class Sample1
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
   // main method 
   public static void main (String [] args)
   {
      System.out.println("main method started");
   
      System.out.println(Sample1.a); // Accesing static data member

      Sample1.test();// Calling static member function 
  
      System.out.println("main method end");
   }
}
