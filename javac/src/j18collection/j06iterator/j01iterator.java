package j18collection.j06iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class j01iterator {
	
	// Iterator interface is extends by Collection Interface
			// Iterator Interface has 1 method iterator() , it return iterator object 
			// It has 
					// hasNext() it return true if collection has value
					// next() it return the value from the list 
			// Iterator is a generic , because it can use with List, Set and Queue 

	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();
		al1.add("Shibaram");
		al1.add("Rout");
		al1.add("Bhubanswer");
		al1.add("Odisha");
		al1.add("Berhamput");
		al1.add("Aska");
		
		Iterator it = al1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
