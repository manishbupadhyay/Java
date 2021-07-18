public class Constructor {
	// Constructor: Constructor invoked when object is created inside a class.
	// Constructor Overloading: Implementing multiple constructor with different argument list
	
	Constructor()// constructor - this is called non-parametrized constructor
	{
		System.out.println("Hey, I'm inside non-parameterized constructor");
	}
	
	Constructor(int a)// parameterized constructor
	{
		System.out.println("Hey, I'm inside parameterized constructor 1");
	}
	
	Constructor(int b, double d, char c)// parameterized constructor
	{
		System.out.println("Hey, I'm inside parameterized constructor 2");
	}
	
	public static void main(String[] args) {
		new Constructor();
		new Constructor(07);
		new Constructor(04,0.5,'A');
		System.out.println("Hey, I'm inside main method");
	}
}
