package oops.inheritance;

public class Student extends School {
	void mathClass() {
		System.out.println("I've enrolled in math class");
	}
	
	public static void main(String[] args) {
		Student std = new Student();
		javaClass();
		std.mathClass();
	}
}
