package j16exception;

public class j14TestRethrowingException {

	public static void main(String[] args) {
		
		j14TestRethrowingException obj1 = new j14TestRethrowingException();
		
		try {
			obj1.exampleF1();
		}catch(NullPointerException np)
		{
			System.out.println("Exception catch and handle");
		}
		

	}
	
	
	public void exampleF1()
	{
		try {
			NullPointerException np = new NullPointerException();
			throw np;
		}catch(NullPointerException np)
		{
			System.out.println("Exception catch but rethrow from catch block");
			throw np;
		}
	}

}
