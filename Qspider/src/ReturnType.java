
public class ReturnType {

   static String name (String name1, String name2)
   {
	   System.out.println("Friend name is "+name1);
	   return(name2);
	

	}

}

class ReturnTypeTest
{
   public static void main (String [] args)
   {
	   String n = ReturnType.name("rahul", "shil");
	   System.out.println(n);
   }
}