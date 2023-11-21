package j02variables;

public class LocalVariable {
	
	
	// Variable declare at method are consider as local variable 
	
	public void exampleF1()
	{
		//static int age=10;// local variable cannot declare as static - compile error 
		int age=10;
		// Local variable can not access out side method. if do compile error 
		
		//static int num=20; local variable cannot declare with static keyword
		//public int pnum=20; Local variable cannot declare with Public,Protected or private modifier
		
		final int pnum=50; // Local variable can declare as final
	}

	public void exampleF2()
	{
		int num=10;
		
		for (int i=0;i<=10;i++)
		{
			int count =0; // Local to {} this block , out side block not allow
			count = count +(i*10);
			System.out.println(count);
		}
		//System.out.println(count);
	}
	
	public static void main(String[] args) {
		

	}

}
