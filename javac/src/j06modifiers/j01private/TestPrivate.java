package j06modifiers.j01private;

public class TestPrivate {

	
	
	// Class can not be private - if we do it compile error (example is: private class TestPrivate)
	
	// Modifier are 1). Private   2). Default or Package  3). Protected  4). Public
	// private modifier is applicable 1) Variable, 2) Method 3) Constructor 4) Inner  class
	// private data member only accessible inside class only - out side class not allow to access
	
	//Reference Class:
	// 1 ModifierInPackageClass
	// 2 ModifierOutPackageClass

	private int age;
	private void  exampleF1()
	{
		System.out.println("Private Method of class TestPrivate");
	}
	
	public static void main(String[] args) {
		
		TestPrivate t1 = new TestPrivate();
		System.out.println(t1.age);
		t1.exampleF1();
	}

}
