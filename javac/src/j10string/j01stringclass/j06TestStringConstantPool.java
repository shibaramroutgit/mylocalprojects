package j10string.j01stringclass;

public class j06TestStringConstantPool {

	
	// String object using string literal, that object is stored in the string constant pool 
	// String object using new keyword, such object is stored in the heap memory.
	
	// When you create a string object using string literal, JVM first checks the content of to be created object. 
	// If there exist an object in the pool with the same content, then it returns the reference of that object. It doesn’t create new object. 
	// If the content is different from the existing objects then only it creates new object.

	// when you create string objects using new keyword, a new object is created whether the content is same or not
	
	public static void main(String[] args) {
		
		// all are store in string constant pool because all object create by string literal
		String s0 = "abc"; 
		String s1 = "xyz";
		String s2 = "123";
		String s3 = "A";
		
		
		// all are store in heap memory because string object create by "new()"
		String s4 = new String("abc");
		String s5 = new String(new StringBuffer());
		char[] c = {'J', 'A', 'V', 'A'};
		String s6 = new String(c);
		
		
		
		// == operator return true when both the object has same physical location 
		String s7 = "Shibaram";
		String s8 = "Shibaram";
		String s9 = "Shiba";
		boolean b1 = (s7==s8);
		System.out.println("boolean1:-"+b1);
		boolean b2 = (s8==s9);
		System.out.println("boolean2:-"+b2);
		
		String s10 = new String("Shibaram");
		String s11 = new String("Shibaram");
		boolean b3 = (s10==s11);
		System.out.println("boolean3:-"+b2);
		
		
		
		
	}

}
