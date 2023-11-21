package j18collection.j08sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class j03Bank 
{
	
	int bid;
	String bname;
	String bcode;
	
	public j03Bank()
	{
		
	}
	
	public j03Bank(int a, String b, String c)
	{
		this.bid=a;
		this.bname=b;
		this.bcode=c;
	}
	
	
	public static void main(String [] args)
	{
		
		ArrayList<j03Bank> al1 = new ArrayList<j03Bank>();
		al1.add(new j03Bank(101,"Shiba","Blank") );
		al1.add(new j03Bank(104,"Ram","Green") );
		al1.add(new j03Bank(103,"Moanjo","Red") );
		al1.add(new j03Bank(107,"Dasa","Yellow") );
		al1.add(new j03Bank(102,"Arabinda","Blue") );
		Collections.sort(al1, new j03NameComparator());
		for(j03Bank j:al1)
		{
			System.out.println(j.bid+"-"+j.bname+"-"+j.bcode);
		}
		
	}

	
}
