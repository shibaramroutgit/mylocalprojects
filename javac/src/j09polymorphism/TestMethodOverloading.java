package j09polymorphism;

public class TestMethodOverloading {
	
	//Polymorphism means multiple form
	
	
	//Static polymorphism or Compile Time Polymorphism means any constructor, operator or method which show ploymorphism at compile time
	//Operator Overloading , Constructor Overloading and Method Overloading are in Static/Compile time polymorphism
	//Static Polymorphism is also called early binding 
	
	//Overloading means declare multiple method with same name but their parameter count and parameter type must be different
	//Compile verify at compile time, so it is static polymorphism - early binding 
	//Method signature : method name , parameter count and parameter type (return type and modifier not in count)
	//If any 2 method signature same then it consider as duplicate
	//If 2 method signature is same but return type are different , still compiler consider as duplicate  (return type and modifier not in count)
	//If 2 method signature is same but one has static modifier, still compiler consider as duplicate  (return type and modifier not in count)
	
	//Overloading method
	public void exampleF1()
	{
		System.out.println("No Parameter Method");
	}
	
	public void exampleF1(int a)
	{
		System.out.println("1 Parameter Method "+ a);
	}
	
	public int exampleF1(int a, int b)
	{
		System.out.println("2 Parameter Method "+ (a+b));
		return a+b;
	}
	
	
	//method signature is duplicate so compile error even if its associate with static  modifier. modifier and return type not consider 
	/*
	 * public static int exampleF1(int a, int b) {
	 * System.out.println("2 Parameter Method "+ (a+b)); return a+b; }
	 */
	
	
	
	//method signature is duplicate so compile error even if its return type different. modifier and return type not consider 
	/*
	 * public double exampleF1(int a, int b) {
	 * System.out.println("2 Parameter Method "+ (a+b)); return a+b; }
	 */
	
	public int exampleF1(String a, String b)
	{
		System.out.println("2 Parameter Method "+ (a+b));
		return 2;
	}
	
	
	public static void main(String[] args) {
		
		TestMethodOverloading d1 = new TestMethodOverloading();
		d1.exampleF1();
		d1.exampleF1(10);
		int x = d1.exampleF1(10, 20);
		System.out.println(x);
		int y = d1.exampleF1("Shiba", "ram");
		System.out.println(y);

	}

}
