package j08constructor;

public class TestConstructCall {

	// Constructor is is use to initialization object not create object 
	// new () is use to create object 
	// Constructor name always same as class name
	// Constructor does not  return any value as like method. 
	// If we add return type into a constructor , it consider as a method only
	
	TestConstructCall() // Zero argument constructor 
	{
		System.out.println("Default / Zero Argument Constructor ");
	}

	TestConstructCall(int a)// One Argument constructor
	{
		System.out.println("One Argument Constructor ");
	}
	TestConstructCall(int a, int b)// 2 argument constructor 
	{
		System.out.println("Two Argument Constructor ");
	}
	
	public static void main(String[] args) {
		
		// we can create object of this class in 3 different ways
		
		TestConstructCall ct1 = new TestConstructCall(); // Zero Constructor call
		TestConstructCall ct2 = new TestConstructCall(10); // One Argument constructor call
		TestConstructCall ct3 = new TestConstructCall(10,20); // Two argument constructor 
	}

}
