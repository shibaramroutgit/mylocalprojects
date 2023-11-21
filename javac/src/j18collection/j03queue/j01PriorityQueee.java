package j18collection.j03queue;

import java.util.PriorityQueue;

public class j01PriorityQueee {
	
	// Priority Queue always work with Comparator 
	// If Comparator not added to Priority Queue then it become natural order (Ascending)
	// it is First-In-First-Out (FIFO)order
	// null not allow but duplicate allow 
	// Thread Safe
	//Constructor
		// PriorityQueue pq = new PriorityQueue() - zero argument 
		// PriorityQueue pq = new PriorityQueue(comparator c) - one argument 
	
	public static void main(String [] args)
	{
		
		PriorityQueue <Integer> pq1 = new PriorityQueue<Integer>();
		pq1.offer(21);
		pq1.offer(17);
		pq1.offer(37);
		pq1.offer(41);
		pq1.offer(9);
		pq1.offer(67);
		pq1.offer(31);
		System.out.println(pq1.toString()); // Ascending order
		System.out.println("-------------------1-------------------------");
		
		int x = pq1.poll(); // Remove the very first element 9 (because of ascending order)
		System.out.println(x);
		System.out.println(pq1.toString());
		System.out.println("-------------------2-------------------------");
		
		
		PriorityQueue <j02School> pq2 = new PriorityQueue<j02School>(new j03ComparatorByName());
		pq2.add(new j02School(101,"Kandraya Bidilaya", "Green") );
		pq2.add(new j02School(201,"Saraswati Bidilaya", "Blak") );
		pq2.add(new j02School(301,"Jayapur Bidilaya", "Red") );
		pq2.add(new j02School(401,"Rajadhi Bidilaya", "Pink") );
		
		for(j02School s1:pq2)
		{
			System.out.println(s1.sid+"-"+s1.sname+"-"+s1.suniformcode);
		}
		
		System.out.println("-------------------3-------------------------");
		
		
		
	}

}
