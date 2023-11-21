package j01controlflow;

public class IFStatements {
	int a = 25;
	int b = 20;
	int c = 30;
	int d = 40;
	public void example1(){
		if (a>b)
		System.out.println("As Condition is True so this Line Execute");
		System.out.println("This Line is Executed Irrespactive of COndition State");
	}
	
	public void example2()
	{
		if (a<b)
		System.out.println("As Condition is True so this Line Execute");
		System.out.println("This Line is Executed Irrespactive of COndition State");
	}
	
	public void example3(){
		if (a<b){
			System.out.println("As Condition is True so this Line Execute");
		}else
		{
			System.out.println("This Line is Executed when Condition is Fail");
		}
	}
	
	public void example4(){
		if (a>b) {
			System.out.println("a is bigger than b");
		}else if (a>b){
			System.out.println("a is bigger than b");
		}else if(a<b) {
			System.out.println("a is smaller than b");
		}else if(a<c) {
			System.out.println("a is smaller than c");
		}else{
			System.out.println("Not a valid Number");
		}
	}
	
	
	
	public void example5()
	{
		if (a<d)
		{
			System.out.println("a is smaller than d");
			if(a<c)
			{
				System.out.println("a is even smaller than c");
				if(a<b)
				{
					System.out.println("a is even smaller than b");
				}else
				{
					System.out.println("a is smaller than d,c but not from b");
				}
				
			}
		}
	}

	public static void main(String[] args) {
		IFStatements ifo = new IFStatements();
		//ifo.example1();
		//ifo.example2();
		//ifo.example3();
		//ifo.example4();
		ifo.example5();

	}

}
