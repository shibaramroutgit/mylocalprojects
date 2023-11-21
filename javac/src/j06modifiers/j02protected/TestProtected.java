package j06modifiers.j02protected;

public class TestProtected {

	// Outer / Primary class cannot be protected - If we do it throw compile error 
	// protected class TestProtected
	
	// protected access in side class and in side package but we can access  out side package using sub class
	// protected modifier is applicable 1) Variable, 2) Method 3) Constructor 4) Inner  class
	
	protected int age;
	protected void exampleF1()
	{
		System.out.println("Proteced method from class TestProtected");
	}
	
	
	public static void main(String[] args) {
		TestProtected tp1 = new TestProtected();
		
		// Protected access inside class
		System.out.println(tp1.age);
		tp1.exampleF1();

	}

}
