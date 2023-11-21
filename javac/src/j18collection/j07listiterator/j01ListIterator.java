package j18collection.j07listiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class j01ListIterator {

	// ListIterator interface is interface  
				// It has 
						// hasNext() it return true if collection has value
						// next() it return the value from the list 
						// previous() it return the previous object from the current object
						// hasPrevioous() it return boolean if previous object present from the current object
						// remove() at iterating we can remove object 
						// set(index, value) at iterating we can set object in given index
						// add(index, value) at iterating we can add object at end of list
				// ListIterator is a specific to ArrayList , it not can use with Set and Queue 

		public static void main(String[] args) {
			
			ArrayList <String>al1 = new ArrayList<String>();
			al1.add("Shibaram");
			al1.add("Rout");
			al1.add("Bhubanswer");
			al1.add("Odisha");
			al1.add("Berhamput");
			al1.add("Aska");
			
			ListIterator it1 = al1.listIterator();
			while(it1.hasNext())
			{
				System.out.println(it1.next());
			}
			System.out.println("---------------1-------------------");
			
			ArrayList <String>al2 = new ArrayList<String>();
			al2.add("Shibaram");
			al2.add("Rout");
			al2.add("Bhubanswer");
			al2.add("Odisha");
			al2.add("Berhamput");
			al2.add("Aska");
			
			ListIterator it2 = al2.listIterator();
			while(it2.hasNext())
			{
				String s1 = (String) it2.next();
				if (s1.equals("Odisha"))
				{
					it2.remove();
				}
				
			}
			System.out.println(al2);

			
			System.out.println("---------------2-------------------");
			
			ArrayList <String>al3 = new ArrayList<String>();
			al3.add("Shibaram");
			al3.add("Rout");
			al3.add("Bhubanswer");
			al3.add("Odisha");
			al3.add("Berhamput");
			al3.add("Aska");
			
			ListIterator it3 = al3.listIterator();
			while(it3.hasPrevious())
			{
				System.out.println(it3.previous()); // It present reverse order 
				
			}
			
			System.out.println("---------------3-------------------");
			
			
		}

}
