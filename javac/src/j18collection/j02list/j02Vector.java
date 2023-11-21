package j18collection.j02list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class j02Vector {
	
	
	// Vector do same as ArrayLit operation only the difference is Vector is Thread Safe 
	// Vector Class Method
		// firstElement() - return very first element 
		// lastElement () - return last element
	// Vector has few Enumeration (as iterator) only applicable to Vector class to traverse
		//elements() - returns enumeration object 
		// hasMoreElements()- return true if collection has object 
		// nextElement() - return the next object

	// We can use Iterator to traverse 
	// Constructor
		// Vector v1 = new Vector() - Zero Argument constructor
		// Vector v2 = new Vector(Collection c) - One Argument constructor 
	
	// Vector collection is not need because we can do synchronized ArrayList by Collections.sycnronizedCollection(ArralyList a) 
	// To traverse we can use Iterator () and List Iterator so no need of Enumeration 
	public static void main(String[] args) {
		
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		
		System.out.println(v1.firstElement()); // Vector CLass Method
		System.out.println(v1.lastElement()); // Vector CLass Method
		System.out.println("---------------1-------------------");
		
		Enumeration<Integer> e1 = v1.elements();  // Enumeration traverse
		
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
		System.out.println("---------------2-------------------");
		
		Iterator it = v1.iterator(); // Iterator Traverse 
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("---------------3-------------------");
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Shiba");
		al1.add("Ram");
		al1.add("Rout");
		
		Vector<String> v2 = new Vector<String>(al1); // Create Vector using other collection 
		System.out.println(v2.toString());
		System.out.println("---------------4-------------------");
	}

}
