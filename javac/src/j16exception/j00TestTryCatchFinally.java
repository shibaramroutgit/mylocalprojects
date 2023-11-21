package j16exception;

public class j00TestTryCatchFinally {

	// In try {} we keep the code which may trigger exception
	// In catch {} we handle exception data
	// in Finally {} it execute always (exception trigger or not trigger , it has no link)
	// Try {}-Catch {}-Finally {} block are a single unit , we can not add any other statement
	//An exception is an abnormal condition which occurs during run time and disrupts the normal flow of the program.  This exception must be handled to maintain the normal flow of the program. 
	//If this exception is not handled properly, the rest of the program will not be executed.
	public static void main(String[] args) {
		String [] names = {"Shiba","1234","Gopal","Hari","100","Mani"};
		
		for(int i=0;i<names.length;i++)
		{		try {
				int x = Integer.parseInt(names[i]);// It throw exception
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
					
				}finally {
					System.out.println("It is Final Block"); // It execute always 
				}
				
		}

	}
		

}
