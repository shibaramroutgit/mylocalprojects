package j05staticandnonstatic;

public class NonStaticExecutionFlow {
	
	int nonstaticV;
	static int staticV;
	
	public static void staticFunctionF1()
	{
		//System.out.println(nonstaticV);// Compile  Error because in static area can not access non static member 
		System.out.println("1--6 "+staticV);
	}
	
	public  void noSstaticFunctionF2()
	{
		System.out.println("4-- "+nonstaticV); // Non Static area we can call both static and non static member
		System.out.println("5-- "+staticV);
	}

	
	
	
	public static void main(String [] args)
	{
		
		NonStaticExecutionFlow.staticV=10;
		NonStaticExecutionFlow.staticFunctionF1();
		//System.out.println(ClassA.nonstaticV);// Compile Error while we access non static member in  a static area 
		
		//ClassA.noSstaticFunctionF2();//Compile Error while we access non static member in  a static area 
		
		
		NonStaticExecutionFlow a1 = new NonStaticExecutionFlow();
		NonStaticExecutionFlow a2 = new NonStaticExecutionFlow();
		
		System.out.println("2-- "+a1.nonstaticV);
		System.out.println("3-- "+a1.staticV);
		a1.noSstaticFunctionF2();
		a1.staticFunctionF1();
		
		System.out.println("7-- "+a2.staticV);
		a2.staticV=20;
		System.out.println("8-- "+a2.staticV);
		
				
		
		
	}
	
	
}
