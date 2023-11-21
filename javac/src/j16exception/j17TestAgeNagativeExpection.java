package j16exception;

public class j17TestAgeNagativeExpection extends Exception
{
	String errorMessage;
	
	public j17TestAgeNagativeExpection(String em)
	{
		this.errorMessage=em;
	}
	
	@Override
	public String toString()
	{
		return errorMessage;
		
	}
	public static void main(String[] args) {
		

	}

}
