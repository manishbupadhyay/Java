class overriding{
	void A() {
		System.out.println("Manish");
	}	
}


class overriding1 extends overriding {
	void A() {
		System.out.println("Aadi");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		overriding1 obj = new overriding1();
		obj.A();
	}
}
