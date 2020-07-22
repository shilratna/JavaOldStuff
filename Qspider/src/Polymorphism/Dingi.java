package Polymorphism;

public class Dingi extends Sambi{
	@Override
	void necklace() {
		System.out.println("Dingi's diamond necklace");
	}

   public static void main(String[] args) {
	
	   Sambi s1 = new Sambi();
	   s1.necklace();
	   
	   Dingi d1 = new Dingi();
	   d1.necklace();
 }
}
