package j08constructor;

public class TestConstructorCallChain {
	
	int tnum;
	String tname;
	int tseat;
	
	public TestConstructorCallChain()
	{
		System.out.println("Zero Argument Constructor");
	}
	
	public TestConstructorCallChain(int a)
	{
		this();
		// this() represent current class zero argument constructor and it always first in line. else compile error 
		this.tnum=a;
		System.out.println("1 Argument Constructor");
	}
	
	public TestConstructorCallChain(String a, int b)
	{
		this(12345);
		// this() represent current class 1 argument constructor and it always first in line. else compile error 
		this.tname=a;
		this.tseat=b;
		System.out.println("2 Argument Constructor");
	}

	
	public static void main(String[] args) {
		
		TestConstructorCallChain t1 = new TestConstructorCallChain("KonarkaExp",1000);
		
		//Step1-- We call 2 argument constructor but inside 2 argument constructor very first line is 1 argument constructor
		//Step2-- Compiler call 1 argument constructor but inside 1 argument constructor very first line is zero argument constructor
		//Step3-- Compile execute FIRST zero argument constructor 
		//Step4-- After zero argument constructor execution it start execute 1 argument constructor
		//Step5-- After 1 argument constructor execution it start execute 2 argument constructor 
		System.out.println(t1.tname);
		System.out.println(t1.tseat);
		System.out.println(t1.tnum);

	}

}
