package j06modifiers.j02protected;

public class TestProtectedInPackage {

	public static void main(String[] args) {
		
		TestProtected tp2 = new TestProtected();
		// Protected  Access is side package 
		System.out.println(tp2.age);
		tp2.exampleF1();
		
		TestProtectedConstructor tpc2 = new TestProtectedConstructor();
		//Protected constructor  allow to create object out side class /inside package
		
	}

}
