package j04finalkey;

public class TestClasswithfinalabstract {
	
//final abstract public class TestClass { - compile error

	//final abstract public void exampleF1(); // Compile error 
	
	/*
	 * final abstract public void exampleF2() { // Compile error 
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		
		//At Class Level
		//final abstract public class TestClass - throw compile time error
		//final  public class TestClass - It allow 
		//abstract public class TestClass - it allow
		//Class either Final or Abstract because both are opposite 
		
		//At Method Level
		// Abstract and final allow at method. 
		// final method - Allow 
		// abstract method - allow
		//it is because final means no change so it always use with concrete method
		//abstract always use with without method body to override which it is contradictory with final 
		
	
	
	}

}
