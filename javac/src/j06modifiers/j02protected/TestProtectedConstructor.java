package j06modifiers.j02protected;

public class TestProtectedConstructor {
	
	//Reference:
	// 1 TestProtectedInPackage
	// 2 TestProtectedOutPackageB
	
	
	//If a class has only protected constructor then out side package / sub class , it not allow to create object
	protected TestProtectedConstructor()
	{
		System.out.println("Protected Constructor");
	}

	
	
	
	public static void main(String [] args)
	{
		//Protected  construct can access inside class so it allow to create object inside class using protected constructor
		TestProtectedConstructor tpc1 = new TestProtectedConstructor();
		
		
		
	}
	
	
	
}
