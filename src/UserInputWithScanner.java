import java.util.Scanner;

public class UserInputWithScanner {

	public static void main(String[] args) {
		
		// we will do multiplication of 2 number with user input
		int a , b , multiply;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();
		
		sc.close();
		multiply = a * b;
		System.out.println("Multiplication of 2 numbers: " + multiply);

	}

}
