
public class VariableAndDataTypes {

	int b=20; // global variable
	int d; // instance variable
	static int c=30; //static variable
	final static int e = 60; // final variable
	public static void main(String[] args) {

		//What is variable - Variable is name of memory location to store values.
		// we use variable to store data and use the data once it is required.

		//Data Type - Data type specifies the size and type of values that can be stored in an identifier.
		// There are 2 data type is java
		//1- Primitive Data Types: Byte, Short, int , long, float, double, boolean, char
		//2- non-Primitive Data Types: String, Array, classes , interfaces

		int a=10; //local variable
		System.out.println("Value of a is: " +a);

		//int c=30;
		System.out.println("Value of c is: " +c);

		// we can access instance variable with creating object
		VariableAndDataTypes instObj = new VariableAndDataTypes();
		int instVar = instObj.d = 50;
		System.out.println("Value of instance variable d is: " + instVar);

		// we can access static variable directly with class name or without class name
		//int stVar = VariableAndDataTypes.c;
		int stVar = c;
		System.out.println("Value of static variable c is: " +stVar);

		int finVar = e;
		System.out.println("Value of final variable e is: " +finVar);

	}

}
