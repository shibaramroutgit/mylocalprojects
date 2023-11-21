package j15generics.j05wildchar;

import java.util.ArrayList;

public class WildCharA {
	
	public static void printArrayData(ArrayList<?> ald)
	{
		for(Object oj :ald)
		{
			System.out.println(oj);
		}
	}
	

	public static void main(String[] args) {
		
		//ArrayList Containing Integers
		 
        ArrayList<Integer> al1 = new ArrayList<>();
 
        al1.add(10);
 
        al1.add(20);
 
        al1.add(30);
 
        printArrayData(al1);
        System.out.println("===========================");
        //Arraylist containing strings
 
        ArrayList<String> al2 = new ArrayList<>();
 
        al2.add("One");
 
        al2.add("Two");
 
        al2.add("Three");
        printArrayData(al2);
        
		

	}

}
