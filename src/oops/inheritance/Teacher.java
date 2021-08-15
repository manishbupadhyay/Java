/* 
 * Hybrid inheritance
 * Class Teacher inherit class Student and class Student inherit class School.
 * Class NonTeachingStaff inherit class school
 * From this class we can call school class method with creating of object of this class also we can call School class method as well
 * Now to access method of NonTeachingStaff class, I've created object of NonTeachingStaff class in this class and I'm able to access method of NonTeachingStaff class
 */
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
		
		NonTeachingStaff nts = new NonTeachingStaff();
		nts.workingInSchool();
		javaClass();
	}
}
