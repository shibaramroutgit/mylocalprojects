package j10string.j01stringclass;

public class j07TestProveStringImmutable {

	public static void main(String[] args) {
		
		String s1 = "shiba";
		String s2 = "shiba";
		boolean b1 = s1==s2;
		System.out.println(b1);
		// it is true because both object has same value , as per String Constant Pool, both pointing to same address
		
		s1 = s1+"rout"; 
		//Changing content of s1 but assigned to same object
		boolean b2 = s1==s2;
		System.out.println(b2);
		// It is false because now s1 modify so it create a new object with new address 
		
		//Note: == use to compare the address of object 
		
		
		String s3 = new String("JAVA");
		System.out.println(s3);
		s3.concat("J2EE"); // It can not change due to immutable , so we can keep concat value in new string object
		System.out.println(s3);
		
		
	}

}
