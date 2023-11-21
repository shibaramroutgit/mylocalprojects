package j16exception;

public class j15TestThrowExceptionToCallingMethod {

	// 'throws' key word is used to throws the exception from called method to calling method 
	// Constructor can also use 'throws' to throw exception 
	//  It is option to throws exception 
	public static void main(String[] args) {
		
		j15TestThrowExceptionToCallingMethod obj1 = new j15TestThrowExceptionToCallingMethod();
		try {
		obj1.exampleF1();
		}catch(Exception e)
		{
			System.out.println("Exception catch");
		}
	}

	public void exampleF1() throws NullPointerException, NumberFormatException
	{
		int i = Integer.parseInt("abc"); // Throw Number Format Exception 
		String s = null;
		System.out.println(s.length()); // Null Pointer Exception
		// In this exception not handle 
	}
	
	
}
