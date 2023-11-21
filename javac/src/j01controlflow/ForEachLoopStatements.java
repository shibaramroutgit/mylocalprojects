package j01controlflow;

public class ForEachLoopStatements {
	
	String [] languages = {"C","C++","Java","DotNet","Python"};
	int [] num = {100,200,300,400,500};
	
	public void example1()
	{
		
		for(String s:languages)
		{
			System.out.println(s);
		}
	}
	
	public void example2()
	{
		
		for(int i:num)
		{
			System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
		
		ForEachLoopStatements fco = new ForEachLoopStatements();
		//fco.example1();
		fco.example2();

	}

}
