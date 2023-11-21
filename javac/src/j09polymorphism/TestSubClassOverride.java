package j09polymorphism;

public class TestSubClassOverride extends TestSuperClassMethod
{


	//Name and return type and access modifier same 
	public void exampleF1() 
	{
		System.out.println("exampleF1() Method of sub ClassF");
	}
	
	
	//Name and return type and access modifier same 
	public int exampleF2() 
	{
		System.out.println("exampleF2() Method of Super ClassF");
		return 10;
	}
	
	
	//Name and return type and access modifier same 
	protected void exampleF3() 
	{
		System.out.println("exampleF3() Method of sub ClassF");
	}
	
	
	//Name and return type same but  access modifier changed to higher( protected  to public)
	public void exampleF4() 
	{
		System.out.println("exampleF4() Method of sub ClassF");
	}
	
	
	
	//Name and return type same but  access modifier changed to higher to lower (public to protected) so compile error   
	/*
	 * protected void exampleF5() {
	 * System.out.println("exampleF5() Method of Super ClassE"); }
	 */
	
	
	// As super class method has 2 argument but this method has 1 argument , it is not consider as overriding
	//It just a independent method of sub class. it means argument must be same in overriding 
	public void exampleF6(int a) 
	{
		System.out.println("exampleF6() Method of sub ClassF");
	}
	
	
	
	public static void main(String[] args) {
		
		TestSubClassOverride f1 = new TestSubClassOverride();
		f1.exampleF1(); // Sub class 
		TestSuperClassMethod e1 = new TestSuperClassMethod();
		e1.exampleF1(); // super class
		f1.exampleF6(10);
		f1.exampleF6(10, 2);
		
	}

}
