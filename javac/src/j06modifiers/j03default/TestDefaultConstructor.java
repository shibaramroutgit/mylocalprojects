package j06modifiers.j03default;

public class TestDefaultConstructor {
	
	//Reference:
	// 1 TestPrivateInPackage
	
	TestDefaultConstructor()
	{
		System.out.println("Private Constructor");
	}

	
	
	
	public static void main(String [] args)
	{
		//default constructor  can access inside class so it allow to create object inside class using default constructor
		TestDefaultConstructor tdc1 = new TestDefaultConstructor();
		
		
		
	}
	
	
	
}
