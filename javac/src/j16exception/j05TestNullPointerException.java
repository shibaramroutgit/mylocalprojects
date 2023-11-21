package j16exception;

public class j05TestNullPointerException {

	public static void main(String[] args) {
		String s = null;
		int x = s.length(); // It throw null pointer exception 
		System.out.println(x);

	}

}
