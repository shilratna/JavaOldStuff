package Polymorphism;

public class Laptop extends Amazon {
	
	@Override
	void productImage()
	{
		System.out.println("Product Image of Laptop.....");
	}
    
	@Override
	void productDetails()
	{
		System.out.println("Product Detail of Laptop.....");
	}
}
