package j16exception;

public class j09TestNextedTryCath {

	
	// Every Try-catch--has its finally block , it may inner or outer 
	// Finally block is optional 
	// Note: when inner exception not handle with catch block , then it move to outer catch block to handle 
	public static void main(String[] args) {
		
		for (int i=0;i<=5;i++)
		{
			try {
					int[] aa = new int[3];
					aa[i]=i;
					try {
							int x = i/0;
						}catch(ArithmeticException ax)
						{
							System.out.println("Innter Try-Catch");
						}finally
						{
							System.out.println("Inner Finally");
						}
			}catch(Exception e)
			{
				System.out.println("Outer Try-Catch");
			}finally
			{
				System.out.println("Outer Finally");
			}
		}
		
		
	}

}
