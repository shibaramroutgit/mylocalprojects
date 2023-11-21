package j16exception;

public class j10TestReturnValueTryCatchinally {

	//When ina method we write try-catch-finally block then how to return value if method has return type
		//If Finally block return a value then it is optional that try-catch return a value 
		//If Finally block not return value then it is must try or catch block return value 
	//Out Side Try-Catch-Finally we cannot define return statement
	//As Finally always executes then even if Try or Catch has return statement , finally return will execute 
	//If Finally block not present and exception not comes then Try block return will work
	//If Finally block not present and exception  comes then catch block return will work
	
	public  int divval(int a, int b)
	{
		try {
			int c = a/b;
			return c;
		}catch(Exception e)
		{
			System.out.println("Catch Block");
			return a+b;
		}
		//return c; out side we cannot return 
	}
	
	public  int addval(int a, int b)
	{
		try {
			int c = a/b;
			return c;
		}catch(Exception e)
		{
			System.out.println("Catch Block");
			return a+b;
		}finally
		{
			System.out.println("Finally Block");
			return 10;
			
		}
		//return c; out side we cannot return 
	}
	public static void main(String[] args) {
		
		j10TestReturnValueTryCatchinally obj1 = new j10TestReturnValueTryCatchinally();
		int x = obj1.divval(8, 0);
		System.out.println(x);
		int y = obj1.addval(8, 2);
		System.out.println(y);
	}

}
