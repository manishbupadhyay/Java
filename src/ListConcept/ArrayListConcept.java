package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		int a[] = new int[3]; // static array , size is fixed.
		
		// dynamic array - ArrayList 
		//1. can contain duplicate value/elements 
		//2. maintain insertion order
		//3. synchronized
		//4. allow random access to fetch the element because it stores the values on the basis of indexes.
		ArrayList arr = new ArrayList();
		arr.add(10); // 0
		arr.add(20);// 1
		arr.add(30);// 2
		arr.add(40);// 3
		
		System.out.println(arr.size());
		
		arr.add(50);
		arr.add(50);
		
		System.out.println(arr.size());
		
		System.out.println(arr.get(4)); // to get value from an index
		
		arr.remove(1);
		
		System.out.println("===============================================");
		// to print all the values from arraylist
		//1. for loop
		//2. Iterator
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		// above is non generic arraylist
		
		// generic arraylist
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(200);
		//arr1.add("Hello"); // this will not allow 
		
		// user define employee class object
		Employee emp = new Employee("Manish", 29, "QA");
		Employee emp1 = new Employee("Roshani", 26, "DEV");
		Employee emp2 = new Employee("Kanchan", 35, "Admin");
		
		// create arraylist of employee
		ArrayList<Employee> arr2 = new ArrayList<Employee>();
		arr2.add(emp);
		arr2.add(emp1);
		arr2.add(emp2);
		
		// iterator to traverse the value
		Iterator<Employee> it = arr2.iterator();
		while(it.hasNext()) {
			Employee emp3 = it.next();
			System.out.println(emp3.name);
			System.out.println(emp3.age);
			System.out.println(emp3.dept);
		}
		
		System.out.println("============================== addAll ================================");
		// addAll() - to add all value from one arraylist to another arraylist
		
		ArrayList<String> arr3 = new ArrayList<String>();
		arr3.add("Java");
		arr3.add("Selenium");
		arr3.add("Jenkins");
		
		ArrayList<String> arr4 = new ArrayList<String>();
		arr4.add("AWS");
		arr4.add("Jira");
		arr4.add("Cucumber");
		
		arr3.addAll(arr4);
		
		for(int i=0; i<arr3.size(); i++) {
			System.out.println(arr3.get(i));
		}
		
		System.out.println("============================== removeAll ================================");
		// removeAll
		arr3.removeAll(arr4);
		for(int i=0; i<arr3.size(); i++) {
			System.out.println(arr3.get(i));
		}
		
		System.out.println("============================== retainAll ================================");
		// retainAll() - to get common value from 2 array list
		ArrayList<String> arr5 = new ArrayList<String>();
		arr5.add("Javascript");
		arr5.add("Katlon");
		arr5.add("LambdaTest");
		
		ArrayList<String> arr6 = new ArrayList<String>();
		arr6.add("jQuery");
		arr6.add("Katlon");
		arr6.add("Docker");
		
		arr5.retainAll(arr6);
		for(int i=0; i<arr5.size(); i++) {
			System.out.println(arr5.get(i));
		}
		
	}
}
