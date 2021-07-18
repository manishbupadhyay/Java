public class ThisCallingStatement {

	ThisCallingStatement() {
		this(6);
		System.out.println("Hey, I'm inside non-parameterized constructor");
	}

	ThisCallingStatement(int a1) {
		this(0.52,'C');
		System.out.println("Hey, I'm inside parameterized constructor - with 1 parameter");
	}

	ThisCallingStatement(double d1 , char c1) {
		System.out.println("Hey, I'm inside parameterized constructor - with 2 parameter");
	}

	ThisCallingStatement(String s, int a2 , char c2) {
		this(0.1,4,'B', "Aadi");
		System.out.println("Hey, I'm inside parameterized constructor - with 3 parameter");
	}

	ThisCallingStatement(double d2, int a3 , char c3 , String s1) {
		this();
		System.out.println("Hey, I'm inside parameterized constructor - with 4 parameter");
	}

	public static void main(String[] args) {
		System.out.println("Hey, I'm inside main method");
		new ThisCallingStatement("Manish", 07, 'O');
	}
}
