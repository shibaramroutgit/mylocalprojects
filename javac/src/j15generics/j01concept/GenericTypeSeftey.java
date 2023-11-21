package j15generics.j01concept;

import java.util.ArrayList;

public class GenericTypeSeftey {
		
	// Generic provides Type Safety due to this type casting not required 
	// Any class cast exception catch at compile time
	
	public static void main(String[] args) {
		
		//collection allow to add any object into it.
		// Problem when we retrieve data and add into respective type. 
		
		//Add without type safety 
		ArrayList a1 = new ArrayList();
		a1.add("Shibaram"); // add string 
		a1.add(1234); // int
		
		// if we add for (String s:al)  it throw compile error
		// if we add for (int i:al)  it throw compile error 
		// ON both case it is error because we add int and string data, so one type not match to both
		// If we add for (object o:al) it works because Objects class is super class of all class
		for(Object s:a1) 
		{
			System.out.println(s);
		}
		
		
		//Add with type safety . it allow to add only Integer object 
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(1234);
		a2.add(222);
		//a2.add("Shring"); compile error to add correct type
		
		for (int i:a2) // it works because directly we add in respective type
		{
			System.out.println(i);
		}
		
		
		
		
	}

}
