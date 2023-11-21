package j13inheritance;

public class MathOption {

	public void dev(int divident, int divisior)
	{
		int c = divident/divisior;
		System.out.println("div() from MathOption class "+c);
	}
	
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("add() from MathOption class "+c);
		
	}

	public int mul(int a, int b) {
		int c = a*b;
		System.out.println("mul() from MathOption class");
		return c;
	}
	
	public static void main(String [] args)
	{
		
	}

}
