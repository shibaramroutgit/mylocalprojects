package j15generics.j02class;

public class TestGenMethod {
	
	
	// GENERIC METHOD
			// When we don't need to define complete Interface or Class to be generic,
			// We can define methods as generic 
			// Generic class and non generic class can have generic method 
			// Generic method can be static or non static 
			// Generic type add just before to method return type
	
	public static <E> void printAddayData(E[] e)
	{
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
	}

	
	
	public static void main(String[] args) {
		
		// 3 different type object array pass to same method as parameter 
		Integer [] ia = {10,20,30,40,50};
		String [] sa = {"Shiba","Ram","Rout"};
		Character [] ca = {'s','h','i','b','a'};
		
		TestGenMethod.printAddayData(ia); // add ia or sa or ca
		
		
	}

}
