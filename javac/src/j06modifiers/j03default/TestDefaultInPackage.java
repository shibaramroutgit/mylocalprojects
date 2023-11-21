package j06modifiers.j03default;

public class TestDefaultInPackage {

	public static void main(String[] args) {
		
		TestDefault t2 = new TestDefault();
		// Default  Access Out side Class 
		System.out.println(t2.age);
		t2.exampleF1();
		
		TestDefaultConstructor tpc2 = new TestDefaultConstructor();

		//Default constructor  allow to create object out side class but inside package
		
	}

}
