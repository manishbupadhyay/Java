package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
	
	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		// add
		ll.add("Java");
		ll.add("Selenium");
		ll.add("cucumber");
		ll.add("Jenkins");
		
		//print 
		System.out.println("Content of Linkedlist: " + ll);
		
		// add first
		ll.addFirst("Testing");
		
		// add last
		ll.addLast("Manish");
		
		System.out.println("Content of Linkedlist: " + ll);
		
		//get
		ll.get(0);
		System.out.println(ll.get(0));
		
		// set
		ll.set(0, "Automation Testing");
		System.out.println(ll.get(0));
		
		// remove first and last element
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("Content of Linkedlist : " + ll);
		
		ll.remove(2);
		System.out.println("Content of Linkedlist : " + ll);
		
		// how to print all the value of linked list
		// for loop
		System.out.println("======================== Using for loop ========================");
		for(int i=0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		// advance for loop
		System.out.println("======================== Using advance for loop ========================");
		for(String str: ll) {
			System.out.println(str);
		}
		// iterator
		System.out.println("======================== Using iterator ========================");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// while loop
		System.out.println("======================== Using while loop ========================");
		int num =0;
		while(ll.size() >num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}
