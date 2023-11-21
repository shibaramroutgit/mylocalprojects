package j09polymorphism;

public class TestSuperClassMethod {

	//Dynamic polymorphism or Run Time Polymorphism means any constructor, operator or method which show ploymorphism at run time
	//Operator Overriding is a run time  time polymorphism
	//Dynamic Polymorphism is also called late binding 
	
	
	//1.0 When a class extends its super class, all or some members of super class are inherited to sub class. 
	//1.1 When a inherited super class method is modified in the sub class, then we call it as method is overriding.
	//2.0 On overriding we consider 
		//Name must be same as super class method 
		//Return type must be same as super class method 
		//Access modifier must be same or higher (cannot reduce)
		//Method argument must be same as super class
	//2.1 if super class method return primitive then sub class method return primitive / same for user define data type
	//3.0 on overriding argument of method must be same as super class method
	// If parameter count and type change then it consider as normal method in sub class
	
	public void exampleF1()
	{
		System.out.println("TestSuperClassMethod -exampleF1()");
	}

	public int exampleF2()
	{
		System.out.println("TestSuperClassMethod -exampleF2()");
		return 10;
	}
	
	protected void exampleF3()
	{
		System.out.println("TestSuperClassMethod -exampleF3()");
	}
	
	protected void exampleF4()
	{
		System.out.println("TestSuperClassMethod -exampleF4()");
	}
	
	public void exampleF5()
	{
		System.out.println("TestSuperClassMethod -exampleF5()");
	}
	
	public void exampleF6(int a, int b)
	{
		System.out.println("TestSuperClassMethod -exampleF6()");
	}
}
