
public class Methods {

	//Method: A method is a collection of statements that perform some specific task and return the result to the caller
	public static void main(String[] args) // Method
	{	
		System.out.println("Methods in Java");
		word();
		Methods obj = new Methods();
		//obj.add(5, 6);
		System.out.println("Value of c is: " + obj.add(5, 6));
	}
	
	public static void word() // static method 
	{
		System.out.println("I am inside word method");
	}
	
    int add(int a, int b) // non static method
    {
		int c=a+b;
		return c;
		
	}
}
