package oops.inheritance;

public class Teacher extends Student {
	void teachSelenium() {
		System.out.println("I am teaching selenium to students");
	}
	
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.teachSelenium();
		teacher.mathClass();
		javaClass();
	}
}
