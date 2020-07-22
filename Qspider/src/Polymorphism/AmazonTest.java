package Polymorphism;

public class AmazonTest {

	public static void main(String[] args) {
		
		Amazon a1 = new Mobile();
		a1.productImage();
		a1.productDetails();
		
		Amazon a2 = new Laptop();
		a2.productDetails();
		a2.productImage();

	}

}
