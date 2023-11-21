package j03operator;

public class logicaloperators {
	
	
//	&& (Logical AND)	expression1 (true) && expression2 (true) it return  true else false
//	|| (Logical OR)		expression1 || expression2 if either expression1 or expression2 is true then return true else false 
//	!  (Logical NOT)	!(expression)	 is true return false / is false   return true
	
	int a = 5,b=3,c=8;
	
	public boolean logicalANDF1()
	{
		if (a>b && b<c)
		{
			System.out.println("True when Both Case return true because it &&");
			return true;
		}else
		{
			System.out.println("Flase when one Case return false because it &&");
			return false;
		}
	}
	
	public boolean logicalORF2()
	{
		if (a>b ||b>c)
		{
			System.out.println("True when any one Case return true because it ||");
			return true;
		}else
		{
			System.out.println("Flase when both  Case return false because it ||");
			return false;
		}
	}
	
	public boolean logicalNOTF3()
	{
		if (!(b>c))
		{
			System.out.println("Case return false then  it is ture or vice varsa because it !");
			return true;
		}else
		{	System.out.println("Case return false then  it is ture or vice varsa because it !");

			return false;
		}
	}
	public static void main (String [] args)
	{
		logicaloperators lps = new logicaloperators();
		boolean b1 = lps.logicalANDF1();
		System.out.println(b1);
		boolean b2 = lps.logicalORF2();
		System.out.println(b2);
		boolean b3 = lps.logicalNOTF3();
		System.out.println(b3);
		
	}

}
