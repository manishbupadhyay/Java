
public class StaticAndNonStaticVariable {

	static int a=7; //static variable
	double d=0.5; // non-static variable
	
	static void A() //static method
	{
		System.out.println("Hey, I'm inside A");
	}
	
	void B() // non-static method
	{
		System.out.println("Hey, I'm inside B");
	}
	
	public static void main(String[] args) {
		System.out.println("Hey, you're inside main method");
		// we can call static method directly also with class name
		A();
		StaticAndNonStaticVariable.A();
		// we can call static variable directly also with class name
		System.out.println("Hey, Value of a is: " + a);
		System.out.println(StaticAndNonStaticVariable.a);
		
		// to call non-static method we need to create object of class
		StaticAndNonStaticVariable obj1 = new StaticAndNonStaticVariable();
		obj1.B();
		// we can call no-static variable with object reference variable
		System.out.println("Hey, value of d is:" +obj1.d);

		// we can also call static methods and variables with object reference variable and we will get warning. In this case program will be run fine but this is not a good pratice
		System.out.println("Value of a is: " + obj1.a);
		obj1.A();
	}
}
