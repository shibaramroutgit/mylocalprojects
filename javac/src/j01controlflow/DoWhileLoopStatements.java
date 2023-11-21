package j01controlflow;

public class DoWhileLoopStatements {

	int a=1;
	int b=5;
	public void example1()
	{
		do{
			System.out.println("Very First Condition execute as default then condition verify");
			a++;
			System.out.println(a);
		}while(a>b);
	}
	
	public void example2()
	{
		do {
			System.out.println("Very First Condition execute as default then condition verify");
			a++;
			System.out.println(a);
		}while(a<b);
	}
	
	public static void main(String[] args) {
		
		DoWhileLoopStatements dow = new DoWhileLoopStatements();
		//dow.example1();
		dow.example2();
	}

}
