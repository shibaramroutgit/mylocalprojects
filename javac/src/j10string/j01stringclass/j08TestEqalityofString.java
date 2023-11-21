package j10string.j01stringclass;

public class j08TestEqalityofString {

	public static void main(String[] args) {
		
		// == when we use with String obje3ct, it compare the address / memory 
		// equals() when we use with String Object, it compare the content of the object
		// hashcode() when we use with String Object, it compare the hashcode of object and it unique when object content different 
			// If both the String object content same then hascode also same 
		//
		
		String s1 = "JavaConceptOfTheDay";
		String s2 = "JavaConceptOfTheDay";
		
		boolean b1 = s1.equals(s2);
		boolean b2 = s1==s2;
		boolean b3 = s1.hashCode()==s2.hashCode();
		
		System.out.println("s1s2 with equals()"+ b1);
		System.out.println("s1s2 with =="+ b2);
		System.out.println("s1s2 with hashcode()"+ b3);
		
		System.out.println("--------------------------------");
		
		String s3 = new String("JavaConceptOfTheDay");
		String s4 = new String("JavaConceptOfTheDay");
		
		boolean b4 = s3.equals(s4);
		boolean b5 = s3==s4;
		boolean b6 = s3.hashCode()==s4.hashCode();
		System.out.println("s3s4 with equals()"+ b4);
		System.out.println("s3s4 with =="+ b5);
		System.out.println("s3s4 with hashcode()"+ b6);
		
		
		
	}

}
