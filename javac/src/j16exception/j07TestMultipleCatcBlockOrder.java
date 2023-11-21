package j16exception;

public class j07TestMultipleCatcBlockOrder {

	public static void main(String[] args) {
		
		// When we use multiple catch block , it should go with more specific to more generic 
		// As Exception is super class of exception so it added ends where as other are more specific so added top 
		// If we do change the order , it compile error because all the catch block below the super exception block are not reachable 
		String [] names = {"Shiba","1234",null,"jadhu","2345"};
		for(int i=0;i<=names.length;i++)
		{
			try {
			int sum = names[i].length()+ Integer.parseInt(names[i]);
			}
			catch(NullPointerException n )
			{
				System.out.println("NullPointerException will be caught here");
			}
			catch(ArithmeticException a)
			{
				System.out.println("ArithmaticException will be caught here");
			}
			catch(NumberFormatException nm)
			{
				System.out.println("NumberFormatException will be caught here");
			}
			catch(ArrayIndexOutOfBoundsException ax)
			{
				System.out.println("ArrayIndexOutOfBoundsException will be caught here");
			}
			catch(Exception e)
			{
				System.out.println("Exception is super of aothetr exception ");
			}
			catch (Throwable ex)
	        {
	            System.out.println("Throwable is super class of Exception");
	        }
			finally
			{
				System.out.println("It is Final Block- It execute after catch proper exceptions");
			}
			
			
		}

	}

}
