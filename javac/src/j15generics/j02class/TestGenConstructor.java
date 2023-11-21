package j15generics.j02class;

public class TestGenConstructor {
	
	
	// GENERIC CONSTRUCTOR
		// We can define constructor as generic 
		// Generic class and non generic class can have generic constructor 
		// Generic type add just before to constructor name
	
	
	
	public <T> TestGenConstructor()
	{
		System.out.println("0 Constructor");
	}
	
	public <T> TestGenConstructor(T a, T b)
	{
		System.out.println("1 Constructor");
		System.out.println(a);
		System.out.println(b);
		
	}
	
	
	public static void main(String[] args) {

		
		TestGenConstructor obj1 = new TestGenConstructor();
		TestGenConstructor obj2 = new TestGenConstructor("Shibaram",102);
		
		
	}

}
