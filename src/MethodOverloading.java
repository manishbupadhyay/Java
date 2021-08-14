public class MethodOverloading {

	// Method Overloading - Same method name but with different parameter.
	void A() {
		System.out.println("I am in method A without any parameter");
		
	}
	
	void A(int i) {
		System.out.println("I am in method A with one int parameter");
		
	}
	
	static void A(double d) {
		System.out.println("I am in method A with one double parameter");
		
	}
	
	static void A(double d, int j) {
		System.out.println("I am in method A with two parameter");
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.A();
		obj.A(5);
		A(7.2);
		A(5.2, 7);
		
	}
}
