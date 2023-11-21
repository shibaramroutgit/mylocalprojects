package j04finalkey;

public class TestFinalVariable {
	
	int age=10;
	final int roll=101;
	//final String name; // it throw compile error because final variable always initialization with value

	public static void main(String[] args) {
		
		TestFinalVariable t1 = new TestFinalVariable();
		t1.age=40;
		//t1.roll=200; it throw compile error as final not change on execution
		
	}

}
