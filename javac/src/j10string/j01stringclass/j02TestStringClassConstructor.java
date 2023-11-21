package j10string.j01stringclass;

public class j02TestStringClassConstructor {
	
	// Zero argument constructor of String Class
		String name = new String();
	
		
	//One argument constructor of String Class with Character Array
		char [] c = {'s','h','i','b','a'};
		String ch = new String(c);
		
		
	//One argument constructor of String Class with String value
		String city = new String("Bhubanswer");
	
		
	//One argument constructor of String Class with StringBuffer object
		StringBuffer bf = new StringBuffer("BBSR");
		String ss = new String(bf);
		
		
	//One argument constructor of String Class with StringBuilder object
		StringBuilder bb = new StringBuilder("BBSR");
		String ff = new String(bf);

	public static void main(String[] args) {
		

	}

}
