package j16exception;

public class j13TestThrowingException {

	// Using 'throw' we can throw an exception explicit 
	public void exampleF1()
	{
		try {
			NullPointerException np = new NullPointerException();
			throw np; 
		}catch(NullPointerException n) // Exception handle at this point
		{
			System.out.println("Exception catch");
		}
	}
	
	
	public void exampleF2()
	{
		try {
			NullPointerException np = new NullPointerException();
			throw np;
		}catch(NumberFormatException f)// Exception not handle at this point but when it call their we can handle 
		{
			System.out.println("Exception catch");
		}
	}
	
	public static void main(String[] args) {
		j13TestThrowingException obj1 = new j13TestThrowingException();
		obj1.exampleF1();
		try {
		obj1.exampleF2();
		}catch(NullPointerException np)
		{
			System.out.println("Exception catch");
		}

	}

}
