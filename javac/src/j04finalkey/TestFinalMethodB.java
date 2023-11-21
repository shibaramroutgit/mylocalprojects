package j04finalkey;

public class TestFinalMethodB {
	
	
	final public void functionOne()   
	{
		System.out.println("Method is functionOne() - Class is MyFinalMethod ");
	}

	final public void functionOne(int a)   // overload with 1 parameter 
	{
		System.out.println("Method is functionOne (int a) - Class is MyFinalMethod "  + a);
	}
	
	final public void functionOne(int a, int b)  // overload with 1 parameter  
	{
		System.out.println("Method is functionOne (int a, int b) - Class is MyFinalMethod "+ (a+b));
	}

	

	 
	public static void main(String[] args) {
		
		TestFinalMethodB m1 = new TestFinalMethodB();
		m1.functionOne();
		
	}

}
