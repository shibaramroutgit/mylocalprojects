package j16exception;

public class j06TestMultipleCatchBlock {

	public static void main(String[] args) {
		String [] names = {"Shiba","1234",null,"jadhu","2345"};
		
		for(int i=0;i<=names.length;i++)
		{
			try {
			int sum = names[i].length()+ Integer.parseInt(names[i]);
			//Above line throw Null pointer, Arithmetic, Number Format and Array Index Out of Boundary
			}
			
			// We can write after Java 7 a single catch with | separator 
			//catch(NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException ex)
            //{
               // System.out.println("Now, this block handles NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException");
           // }
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
			finally
			{
				System.out.println("It is Final Block- It execute after catch proper exceptions");
			}
			
			
		}

	}

}
