package j06modifiers.j01private;

public class TestPrivateConstructor {
	
	//Reference:
	// 1 TestPrivateInPackage
	
	private TestPrivateConstructor()
	{
		System.out.println("Private Constructor");
	}

	
	
	
	public static void main(String [] args)
	{
		//Private member can access inside class so it allow to create object inside class using private constructor
		TestPrivateConstructor tpc1 = new TestPrivateConstructor();
		
		
		
	}
	
	
	
}
