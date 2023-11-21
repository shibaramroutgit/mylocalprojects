package j06modifiers.j03default;

public class TestDefault {
	
	// class member without any access modifier are consider as default
	// Default access in side class and in side package but not out side package
	// default modifier is applicable 1) Variable, 2) Method 3) Constructor 4) Inner  class
	
	int age;
	
	
	void exampleF1()
	{
		System.out.println("Default Method from class TestDefault");
	}
	
	public static void main(String[] args) {
		
		
		TestDefault td1 = new TestDefault(); 
		
		// default modifier variable access 
		System.out.println(td1.age);
		
		//default modifier method
		td1.exampleF1();
	}

}
