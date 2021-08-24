import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("================================== Reverse string with method 1 ==================================");
		// 1st method
		String str = "Manish Upadhyay";
		String output = "";
		for(int i=str.length()-1; i>=0; i--) 
			output = output + str.charAt(i);
		System.out.println("Reverse of given string is: " + output);

		System.out.println("================================== Reverse string with method 2 ==================================");
		// 2nd Method
		// Using StringBuffer class

		StringBuffer stringBuffer = new StringBuffer("Manish Upadhyay");
		// use reverse method to reverse string
		System.out.println(stringBuffer.reverse());


		System.out.println("================================== Reverse string with method 3 ==================================");
		// 3rd Method
		String input = "Manish Upadhyay";
		StringBuilder strBuilder = new 	StringBuilder();
		strBuilder.append(input);
		strBuilder= strBuilder.reverse();
		System.out.println(strBuilder);
		
		System.out.println("================================== Reverse string with method 4 ==================================");
		// take string from user then reverse that string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string which you want to reverse");
		String strg = sc.next();
		sc.close();
		String s1 = "";
		for(int i=strg.length()-1; i>=0; i--)
			s1 = s1 + strg.charAt(i);
		System.out.println("Your reverse string is: " + s1);
		
	}
}
