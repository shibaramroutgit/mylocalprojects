package j15generics.j04bounded;

public class GenericBoundedClass <T extends Number> 
{
	T x;
	
	public GenericBoundedClass(T t)
	{
		this.x =t;
	}

	// AT this we says T is upper bounded with number class
	// It means it can only accept byte, int, long, float and double
	// 
	public static void main(String[] args) {
		
		
		GenericBoundedClass gc1 = new GenericBoundedClass(1234);
		System.out.println(gc1.x);
		
		GenericBoundedClass gc2 = new GenericBoundedClass(123.45);
		System.out.println(gc2.x);
		
		
		// It throw compile time error because it is bounded with Number Class
		//GenericClass gc3 = new GenericClass("shiba");
		//System.out.println(gc3.x);
		
		
	}

}
