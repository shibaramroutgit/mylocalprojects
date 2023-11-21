package j13inheritance;

public class TestDefaulteObjectClassExtends {
	int age;
	String name;

	//If we not declare any extends class By default, every class is a sub class of java.lang.Object class
	//Class cannot extends itself - it is compile error 
	
	TestDefaulteObjectClassExtends(int a, String b)
	{
		this.age=a;
		this.name="Shibaram";
	}
	
	//public String toString() is Object class method as per inheritance we can overload 
	@Override
	public String toString()
	{
		
		
		return this.age +"-"+this.name;
		
	}
		public static void main(String[] args) {
			
			TestDefaulteObjectClassExtends u1 = new TestDefaulteObjectClassExtends(40,"Shibaram");
			String rv = u1.toString();
			System.out.println(rv);
			
		}

}
