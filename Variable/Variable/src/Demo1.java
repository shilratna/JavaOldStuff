class Car
{
static String color = "Red";
double price = 5632542.25;
}
public class Demo1
{
public static void main(String[] args)
{
String name = "Swift";
System.out.print(name+" ");
System.out.print(Car.color+" ");
System.out.print(new Car().price);
}
}