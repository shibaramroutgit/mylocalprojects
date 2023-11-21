package j18collection.j05set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class j01TestHashSet {

	// Constructor of HashSet Class
		// HashSet h1 = new HashSet() -- Zero Argument Constructor
		// HashSet h2 = new HashSet(Collection c) -- One Argument Constructor

	// Properties of HastSet
		// Duplicate not allow , only unique
		// Null allow but only once
		// Index base operation we cannot do on it
		// HashSet, LinkedHashSet and TreeSet are teh class of Set interface
		// HashSet ot syncronized (not thread safe)

	// HashSet offers constant time performance for insertion, removal and retrieval operations.



	public static void main(String[] args) {

		HashSet<String> h1 = new HashSet<>();
		h1.add("Sibaram");
		h1.add("Gopal");
		h1.add("Sibaram");
		h1.add("Jadhu");
		System.out.println(h1.toString()); // Duplicate value not allow
		System.out.println("----------------------1--------------------");

		h1.add(null);
		h1.add(null);
		h1.add("Ravi");
		System.out.println(h1.toString()); // Only 1 null value allow to store
		System.out.println("----------------------2--------------------");

		System.out.println(h1.toString()); // On each run value order change , it not hold order
		System.out.println("----------------------3--------------------");

		HashSet<String> h2 = new HashSet<String>();
		h2.add("Sibaram");
		h2.add("Gopal");
		h2.add("Dasarathi");
		h2.add("Jadhu");
		Set<String> h3 = Collections.synchronizedSet(h2);
		System.out.println("----------------------4--------------------");


















































	}

}
