package oops.inheritance;
/* 
 * Hierarchical level inheritance
 * Class NonTeachingStaff and Student inherit class School but there is no relation between these 2 classes.
 * From this class we can call school class method with creating of object of this class
 * Now to access method of student class, I've created object of student class in this class and I'm able to access method of student class
 */
public class NonTeachingStaff extends School {
	void workingInSchool() {
		System.out.println("I'm working in school as office attendent");
	}
	
	public static void main(String[] args) {
		NonTeachingStaff nts = new NonTeachingStaff();
		nts.workingInSchool();
		javaClass();
		
		// here I'm creating object of student class
		Student st = new Student();
		st.mathClass();
		javaClass();
	}
}
