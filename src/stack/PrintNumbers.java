package stack;

public class PrintNumbers {

	// handle stack over error - enter value -Xss5m in run configuration then you will not receive stack over flow error.
	static int count = 1;
	
	public static void printNum() {
		if(count <=100000) {
			System.out.println("Manish");
			count++;
			// again call printNum() method
			printNum();
		}
	}
	public static void main(String[] args) {
		printNum();
		System.out.println("welcome");

	}

}
