package j10string.j01stringclass;

public class j05TestStringMethods {

	public static void main(String[] args) {

		
		// Length()
		String s1 = "Shibaramrout";
		int x1 = s1.length();
		System.out.println(x1);
		
		//charAT(index)
		String s2 = "Shibaramrout";
		char c = s2.charAt(8);
		System.out.println(c);
		
		//getChars(start Index, End Index, Array to Store, Store Begin at Index of array)
		String s3 = "JavaConceptOfTheDay";
		char [] c1 = new char[10];
		
		s3.getChars(4, 11, c1, 2);
		for(char cc:c1)
		{
			System.out.println(cc);
		}
		
		//toCharArray()
		String s4 = "JavaConceptOfTheDay";
		char [] c2 = new char[s4.length()];
		c2 = s4.toCharArray();
		System.out.println(c2.length);
		for(char cd:c2)
		{
			System.out.println(cd);
		}
		
		//subString(String, start Index)
		String s5 = "JavaConceptOfTheDay";
		String s6 = s5.substring(4);
		System.out.println(s6);
		
		
		//subString(String, start Index, end Index)
		String s7 = "JavaConceptOfTheDay";
		String s8 = s7.substring(4, 11);
		System.out.println(s8);
		
		
		//equals()
		String s9 = "JavaConcept";
		String s10 = "JavaConcept";
		String s11 = "JConcept";
		boolean b2 = s9.equals(s10);
		boolean b3 = s9.equals(s11);
		System.out.println(b2);
		System.out.println(b3);
		
		//
	}

}
