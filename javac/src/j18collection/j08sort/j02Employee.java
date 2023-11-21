package j18collection.j08sort;

import java.util.ArrayList;
import java.util.Collections;

public class j02Employee implements Comparable<j02Employee>{

	
	// Sort Test in Class "j03ESortComparableObject"
	int eid;
	String ename;
	String euniformcode;
	
	public j02Employee()
	{
		
	}
	
	public j02Employee(int a, String b, String c)
	{
		this.eid=a;
		this.ename=b;
		this.euniformcode=c;
	}
	
	

	@Override
	public int compareTo(j02Employee b) // Sort by EID so I am overriding by EID column
	{
		
		return this.eid - b.eid ; // Ascending order
		//return b.id - this.id; // Descending order
	}
	
	public static void main(String[] args) {
		
		ArrayList<j02Employee> al1 = new ArrayList<j02Employee>();
		al1.add(new j02Employee(101,"Shiba","Blank") );
		al1.add(new j02Employee(104,"Ram","Green") );
		al1.add(new j02Employee(103,"Moanjo","Red") );
		al1.add(new j02Employee(107,"Dasa","Yellow") );
		al1.add(new j02Employee(102,"Arabinda","Blue") );
		Collections.sort(al1);
		for(j02Employee e:al1)
		{
			System.out.println(e.eid+"-"+e.ename+"-"+e.euniformcode);
		}
		
		
		
	}

}
