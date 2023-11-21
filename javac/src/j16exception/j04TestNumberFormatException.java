package j16exception;

public class j04TestNumberFormatException {

	public static void main(String[] args) {
		
		Integer i = new Integer("abc"); // NumberFormatException
		
		System.out.println("This statement will not be executed"); // it not execute due to exception
		
		
	}

}
