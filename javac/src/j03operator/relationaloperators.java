package j03operator;

public class relationaloperators {
	// This operator return boolean value true or false
	//	==	Is Equal To	3 == 5 returns false
	//	!=	Not Equal To 3 != 5 returns true
	//	>	Greater Than 3 > 5 returns false
	//	<	Less Than 3 < 5 returns true
	//	>=	Greater Than or Equal To 3 >= 5 returns false
	//	<=	Less Than or Equal To 3 <= 5 returns true
	
	int a = 7, b = 11;
	
	public boolean isEqualToF1()
	{
		System.out.println("==	Is Equal To");
		if (a==b)
		{
			return true;
		}else 
		{
			return false;
		}
	}
	
	public boolean notEqualToF2()
	{
		System.out.println("!=	Not Equal To");
		if (a!=b)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean greaterThanF3()
	{
		System.out.println(">	Greater Than");
		if (a > b)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	
	public boolean lessThanF4()
	{
		System.out.println("<	Less Than");
		if (a < b)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	
	public boolean graterThenEqualF5()
	{
		System.out.println(">=	Grater Than Equal");
		if (a>=b)
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	
	public boolean lessThenEqualF6()
	{
		System.out.println("<=	Less Than Equal");
		if (a<=b)
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		 
		relationaloperators rop = new relationaloperators();
		boolean b1 = rop.isEqualToF1();
		System.out.println(b1);
		boolean b2 = rop.notEqualToF2();
		System.out.println(b2);
		boolean b3 = rop.greaterThanF3();
		System.out.println(b3);
		boolean b4 = rop.lessThanF4();
		System.out.println(b4);
		boolean b5 = rop.graterThenEqualF5();
		System.out.println(b5);
		boolean b6 = rop.lessThenEqualF6();
		System.out.println(b6);
		 
		 

	}

}
