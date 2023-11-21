package j01controlflow;

public class WhileLoopStatements {
	
	int x =10;
	
	public void example1()
	{
		while(x>=1)
		{
			System.out.println(x);
			x--;
		}
	}

	public void example2()
	{
		while(x>=1)
		{
			System.out.println(x*10);
			x--;
		}
	}
	public static void main(String[] args) {
		
		WhileLoopStatements who = new WhileLoopStatements();
		//who.example1();
		who.example2();
	}

}
