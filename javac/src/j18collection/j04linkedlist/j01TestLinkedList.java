package j18collection.j04linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class j01TestLinkedList {

	
	// LinkedList class implements List Interface ad Queue Interface
	// LinkList is a data structure where 1st Element is a reference to Previous OBject 2ns is current Object 3rd is reference to next object 
	// LinkedList support 
		// Remove object from both end because of data structure (it hold previous and next object reference)
		// Allow Null , Duplicate as List Interface allow 
		// Allow add, remove , retrieve by index 
	//LinkedLIst Constructor
		// LinkedLIst ls1 = new LinkedLIst() -- Zero Argument Constructor
		// LinkedlIst ls1 = new LinkedLIst(collection c) - One Argument Constructor 
	public static void main(String[] args) {
		
		LinkedList<Integer>ls1 = new LinkedList<Integer>();
		ls1.add(10); // It added object at end of list
		ls1.add(30);
		ls1.add(40);
		System.out.println(ls1.toString());
		System.out.println("------------------1---------------------");
		
		
		ls1.add(1, 20); // It added object at given index 
		System.out.println(ls1.toString());
		System.out.println("------------------2---------------------");
		
		
		LinkedList<Integer> ls2 = new LinkedList<Integer>();
		ls2.add(100);
		ls2.add(200);
		ls2.add(300);
		ls1.addAll(ls2); // all a collection at end of the list 
		System.out.println(ls1);
		System.out.println("------------------3---------------------");

		
		LinkedList<Integer> ls3 = new LinkedList<Integer>();
		ls3.add(50);
		ls3.add(60);
		ls3.add(70);
		ls1.addAll(4, ls3); // Add a collection at given index 
		System.out.println(ls1.toString());
		System.out.println("------------------4---------------------");
		
		
		ls1.addFirst(1);// Add object at top
		System.out.println(ls1.toString());
		System.out.println("------------------5---------------------");
		
		
		ls1.addLast(10000);// Add object at bottom
		System.out.println(ls1.toString());
		System.out.println("------------------5---------------------");
		
		
		System.out.println(ls3.toString());
		ls3.clear(); // Clear all values from linked list 
		System.out.println(ls3);
		System.out.println("------------------6---------------------");
		
		LinkedList ls4 = new LinkedList();
		ls4 = (LinkedList) ls1.clone(); // create a copy of list
		System.out.println(ls4);
		System.out.println("------------------7---------------------");
		
		
		boolean b1 = ls1.contains(10);
		System.out.println(b1); // return true or false if an object present 
		System.out.println("------------------8---------------------");
		
		Iterator it = ls1.descendingIterator(); // Descending order of list 
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("------------------9---------------------");
		
		
		
		int i = ls1.element(); // return very first element
		int j = ls1.getFirst(); // return very first element
		int k = ls1.getLast(); // return very last element
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println("------------------10---------------------");
		
		
		
		int l = ls1.removeFirst(); // remove very first element
		int m = ls1.removeLast(); // remove very last element
		System.out.println(l);
		System.out.println(m);
		System.out.println("------------------11---------------------");
		
		
		int n = ls1.size(); // return size
		System.out.println(n);
		System.out.println("------------------11---------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
