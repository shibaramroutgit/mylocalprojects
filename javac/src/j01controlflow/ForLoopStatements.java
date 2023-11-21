package j01controlflow;

public class ForLoopStatements {

	public void example1()
	{
		for(int i=1;i<10;i++)
		{
			System.out.println(i);
		}
	}
	
	public void example2()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
	}
	
	public void example3()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%5!=0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ForLoopStatements flo = new ForLoopStatements();
		//flo.example1();
		flo.example2();
		flo.example3();

	}

}
