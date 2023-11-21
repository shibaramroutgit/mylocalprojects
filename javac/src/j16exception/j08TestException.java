package j16exception;

public class j08TestException {

	public static void main(String[] args) {
		// Exception is the primary class of all exception so we can manage all exception by parent class reference 
		
		
		String [] names = {"Shiba","1234",null,"jadhu","2345"};
		for(int i=0;i<=names.length;i++)
		{
			try {
			int sum = names[i].length()+ Integer.parseInt(names[i]);
			//Above line throw Null pointer, Arithmetic, Number Format and Array Index Out of Boundary
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}finally
			{
				System.out.println("It is Finbally Block");
			}
		}

	}

}
