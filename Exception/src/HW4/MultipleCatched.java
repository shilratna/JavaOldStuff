/*Write a java program to handle exception 
 * event with the help of try and 
 * multiple catch block
 */
package HW4;

public class MultipleCatched {
	
		void add(int a,int b){
			System.out.println("Running add(arg) method .... ");
			System.out.println("Add result is :"+(a+b));
		}
		
		void div(int a,int b){
			System.out.println("Running div(arg) method....");
			
			try {
				System.out.println("Div result is :"+(a/b));
			}
			catch(ArithmeticException ae) {
				System.out.println("AE handle in div stack");
			}
			catch(ArrayIndexOutOfBoundsException abe) {
				System.out.println("AIOBE handle in div stack");
			}
			catch(NullPointerException ne) {
				System.out.println("NE handle in div stack");
			}
			add(a,b);
			
		}
		void sub(int a,int b) {
			System.out.println("Running sub(arg) method .... ");
			System.out.println("Sub result is :"+(a-b));
			div(a,b);
		}

	}


	
