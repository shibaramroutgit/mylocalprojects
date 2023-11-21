package j16exception;

public class j02TestArithmaticException {

	public static void main(String[] args) {
		int i = 100/0;
		System.out.println(i); // throw arithmetic exception
		
		System.out.println("Now, This statement will also be executed");
	}

}
