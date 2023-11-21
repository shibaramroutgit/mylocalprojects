package j06modifiers.j05outpackage;




public class TestDefaultOutPackage //extends TestDefault

{

public static void main(String[] args) {
		
		// Default  not Access out side package to sub class
		
		//TestDefault t3 = new TestDefault();
		//System.out.println(t3.age);
		//t3.exampleF1();
		
		// Default member are not  inherited into sub class inside package
		//So using sub-class object we  can  not  Access Default member of super class
		TestDefaultOutPackage tps1 = new TestDefaultOutPackage();
		//System.out.println(tps1.age);
		//tps1.exampleF1();

	}

}
