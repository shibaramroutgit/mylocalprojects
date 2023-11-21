package j06modifiers.j05outpackage;


import j06modifiers.j02protected.TestProtected;
import j06modifiers.j03default.TestDefault;

public class TestProtectedOutPackage extends TestProtected
{

	public static void main(String[] args) {
		
		// Protected  can Access out side package to sub class
		
		TestDefault t3 = new TestDefault();
		// Allow to create object but using Super class object we cannot access data member
		//System.out.println(t3.age);
		//t3.exampleF1();
				
		
		// Protected member are   inherited into sub class out package
		//So using sub-class object we  can    Access protected member of super class
		TestProtectedOutPackage tps1 = new TestProtectedOutPackage();
		System.out.println(tps1.age);
		tps1.exampleF1();
	}

}
