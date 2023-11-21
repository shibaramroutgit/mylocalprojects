package j18collection.j02list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class j01TestArrayList {

	// ArrayList not synchronized , it means multiple thread can access at a time 
	// Difference of Array and ArryaList
		// Array store both Primitive and Derive data type where ArrayList only hold Derive type
		// Array is size not grow at run time   where ArrayList increase size at run time 
		// Array is not type safety where ArrayList is type safety 
		// Array has not predefine method to manipulate where ArrayList has 
	// We can sort ArrayList by collections.sort(list) or by Collections.sort(List, Comparator c)
	
	
	
	public static void main(String[] args) {
		
		ArrayList AL01 = new ArrayList(); // Blank Constructor 
		ArrayList AL02 = new ArrayList(AL01); // Accept Collation Constructor 
		
		
		
		ArrayList al0 = new ArrayList();
		al0.add(10);
		al0.add(20);
		al0.add(30);
		al0.add(40);
		al0.add(50);
		System.out.println(al0.get(2)); // ArrayList Implement RandomAccess Interface so we can find value by get(index) method
		System.out.println(al0.set(2, 300)); // ArrayList Implement RandomAccess Interface so we can update value by set(index,value) method
		System.out.println(al0.toString());
		al0.remove(2); // ArrayList Implement RandomAccess Interface so we can delete value by remove(index) method
		System.out.println(al0.toString());
		al0.add(1, 500); // ArrayList Implement RandomAccess Interface so we can add at given index  by add(index,value) method
		System.out.println(al0.toString());
		System.out.println("--------------1-----------------------");
		
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		System.out.println(al1.size()); // Give the size of Array
		System.out.println("---------------------2-----------------");
	
		
		ArrayList al3 = new ArrayList();
		al3.add("shiba");
		al3.add("Ram");
		al3.add("Rout");
		al3.add("Rout");
		al3.add("Ram");
		al3.remove(3); // It remove the object from given index
		System.out.println(al3.toString());
		al3.remove("Ram"); // it remove first occurrence of object as List accept duplicate value 
		System.out.println(al3.toString());
		System.out.println("-------------------3-------------------");
		
		
		ArrayList al4 = new ArrayList();
		al4.add(null); // Allow null and duplicate null 
		al4.add(200);
		al4.add(null);
		System.out.println(al4.toString());
		System.out.println("-----------------4-------------------");
		
		
		ArrayList al5 = new ArrayList();
		al5.add("shiba");
		al5.add("Ram");
		al5.add("Rout");
		al5.add("Odisha");
		System.out.println(al5.indexOf("Rout")); // It return the index of given object 
		System.out.println("-----------------5-------------------");
		
		
		String [] s1 = {"Shiba","Ram","Rout","Berhampur","Odisha"};
		ArrayList al6 = new ArrayList(Arrays.asList(s1)); // Convert array to ArrayList. Arrays.AsList(array) return a List Collection
		System.out.println(al6.toString());
		
		String [] s2 = {"Shiba","Gopal","Hari","Jadhu","Madhu"};
		ArrayList al7 = new ArrayList();
		Collections.addAll(al7, s2); // Collections class has a method addAll(List Collection, Array)
		System.out.println(al7.toString());
		System.out.println("-----------------6-------------------");
		
		
		ArrayList al8 = new ArrayList();
		al8.add("Shiba");
		al8.add("Ram");
		al8.add("Rout");
		al8.add("Odisha");
		String [] s3 = new String[al8.size()];
		al8.toArray(s3);
		for(String sx:s3)
		{
			System.out.println(sx);
		}
		System.out.println("-----------------7-------------------");
		
		ArrayList al9 = new ArrayList();
		al9.add("Shibaram");
		al9.add("Rout");
		al9.add("Bhubanswer");
		al9.add("Odisha");
		al9.add("Berhamput");
		al9.add("Aska");
		System.out.println(al9.toString());// Default sort by insert order
		Collections.sort(al9);
		System.out.println(al9.toString());//  sort by Ascending Order
		
		ArrayList al10 = new ArrayList();
		al10.add("Shibaram");
		al10.add("Rout");
		al10.add("bhubanswer");
		al10.add("odisha");
		al9.add("Berhamput");
		al10.add("Aska");
		Collections.sort(al10);
		System.out.println(al10.toString()); // Did not sort data properly because of case insensitive 
		Collections.sort(al10,String.CASE_INSENSITIVE_ORDER); // As my List is String and I added Comparator String to ignore case
		System.out.println(al10.toString());
		System.out.println("-----------------8-------------------");
		
		
		ArrayList al11 = new ArrayList();
		al11.add("Shibaram");
		al11.add("Rout");
		al11.add("Bhubanswer");
		al11.add("Odisha");
		al11.add("Berhamput");
		al11.add("Aska");
		Collections.sort(al11);
		System.out.println(al11.toString());
		Collections.reverse(al11);
		System.out.println(al11.toString());
		System.out.println("-----------------9-------------------");
		
		
		
		ArrayList<String> al12 = new ArrayList<String>();
		al12.add("shiba");
		al12.add("Ram");
		al12.add("Rout");
		al12.add("Rout");
		al12.add("Ram");
		al12.add("Syma");
		System.out.println(al12.toString());
		
		HashSet<String> h1 = new HashSet<String>(al12); // We create a HashSet using List Collection it is because Set does not hold duplicate 
		//  By convert from List to HashSet , it remove the insert order of list collection , we can use LiskedHashSet to maintain the order
		ArrayList<String> al13 = new ArrayList<String>(h1);
		System.out.println(al13.toString());
	
		System.out.println("-------------------10-------------------");
		
		ArrayList<String> al14 = new ArrayList<String>();
		al14.add("shiba");
		al14.add("Ram");
		al14.add("Rout");
		al14.add("Rout");
		al14.add("Ram");
		al14.add("Syma");
		System.out.println(al14.toString());
		
		LinkedHashSet<String> lh1 = new LinkedHashSet<String>(al14); // We create a LinkedHashSet using List Collection it is because LinkedHashSet does not hold duplicate and keep the insert order of list collection
		//  By convert from List to HashSet , it remove the insert order of list collection , we can use LiskedHashSet to maintain the order
		ArrayList<String> al15 = new ArrayList<String>(lh1);
		System.out.println(al15.toString());
		System.out.println("-------------------11-------------------");
		
		
		ArrayList<String> al16 = new ArrayList<String>();
		al16.add("shiba");
		al16.add("Sayam");
		al16.add("Hari");
		al16.add("Jadhu");
		al16.add("Sadhu");
		al16.add("Madhu");
		System.out.println(al16.toString());
		
		System.out.println("Reterive data by for Each Loop:--");
		for(String s:al16)
		{
			System.out.println(s);
		}
		
		System.out.println("Reterive data by Iterator:--");
		Iterator it1=	al16.iterator();// iterator() a method override in List Class from Iterator Interface and return a iterator object.It is a generic iterator, can use for all collection 
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		System.out.println("Reterive data by List Iterator:--");// listIterator() is a method of List collection having more method compare to iterator(). ListIterator is a non a generic iterator to use for all collection
		ListIterator lt1 = al16.listIterator();
		while(lt1.hasNext())
		{
			System.out.println(lt1.next());
		}
		
		System.out.println("-------------------12-------------------");
		
		
		ArrayList<String> al17 = new ArrayList<String>();
		al17.add("shiba");
		al17.add("Sayam");
		al17.add("Hari");

		ArrayList<String> al18 = new ArrayList<String>();
		al18.add("Jadhu");
		al18.add("Madhu");
		al18.add("Sadhu");
		
		al18.addAll(al17); // all a collection into a another collection at end of the collection
		System.out.println(al18.toString());
		
		System.out.println("-------------------13-------------------");
		
		
		ArrayList<String> al19 = new ArrayList<String>();
		al19.add("shiba");
		al19.add("Sayam");
		al19.add("Hari");

		ArrayList<String> al20 = new ArrayList<String>();
		al20.add("Jadhu");
		al20.add("Madhu");
		al20.add("Sadhu");
		
		al19.addAll(al20); // all a collection into a another collection at end of the collection
		System.out.println(al19.toString());
		
		al19.removeAll(al20); // Remove a collection from a collection
		System.out.println(al19.toString());
		
		System.out.println("-------------------14-------------------");
		
		
		ArrayList<String> al21 = new ArrayList<String>();
		al21.add("shiba");
		al21.add("Sayam");
		al21.add("Hari");
		al21.add("Jadhu");
		al21.add("Madhu");
		al21.add("Sadhu");
		System.out.println(al21.toString());
		ArrayList<String> al22 = new ArrayList<String>();
		al22.add("Jadhu");
		al22.add("Madhu");
		al22.add("Sadhu");
		al22.add("Tipu");
		
		al21.retainAll(al22);// Only keep those objects which are match with the passed object 
		System.out.println(al21.toString());
		
		System.out.println("-------------------15-------------------");
		
		
		ArrayList<String> al23 = new ArrayList<String>();
		al23.add("shiba");
		al23.add("Sayam");
		al23.add("Hari");
		al23.add("Jadhu");
		// ArrayList not synchronized (not Thread Safe) to do we use Collections.syncronizedCollection(collection c))
		Collections.synchronizedCollection(al23); // Collection is Synchronized 
		System.out.println("-------------------16-------------------");
		
		
		
		
		
		
		
	}

}
