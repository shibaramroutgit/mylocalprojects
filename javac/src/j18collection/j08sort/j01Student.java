package j18collection.j08sort;

import java.util.ArrayList;
import java.util.Collections;

public class j01Student {

	int sid;
	String sname;
	String suniformcode;
	
	public j01Student()
	{
		
	}
	
	public j01Student(int a, String b, String c)
	{
		this.sid=a;
		this.sname=b;
		this.suniformcode=c;
	}
	
	public static void main(String[] args) {
		
		ArrayList<j01Student>al1 = new ArrayList<j01Student>();
		al1.add(new j01Student(101,"Shiba","Blank") );
		al1.add(new j01Student(102,"Ram","Green") );
		al1.add(new j01Student(103,"Moanjo","Red") );
		al1.add(new j01Student(104,"Dasa","Yellow") );
		al1.add(new j01Student(105,"Arabinda","Blue") );
		
		//Collections.sort(al1); //Direct sort not possible , to sort derive type we need comparable and comparator

	}

}
