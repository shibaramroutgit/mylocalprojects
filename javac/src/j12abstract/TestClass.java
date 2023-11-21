package j12abstract;

public class TestClass {
	
	static int age; 
	// We can declare variable , as object not allow so it is recommended to declare class level variable as static
	// we can declare not static as well
	public void nonAbstractf1()
	{
		System.out.println("nonAbstractf1()");
	}
	
	
	//public abstract void nonAbstractf2();
	// As class is non abstract , it does not allow abstract method. we have to change class as abstract 
	
	

	public static void main(String[] args) {
		// Class is a normal class which can content only non abstract method
		// If we add abstract method throw compile error to change the class type as abstract
		// "abstract" only applicable to Class and Method 
		/// As class is non abstract , it does not allow abstract method. we have to change class as abstract 

	}

}
