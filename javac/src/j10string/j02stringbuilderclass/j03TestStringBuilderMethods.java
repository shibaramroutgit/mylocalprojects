package srout.prox.j10string.j02stringbuilderclass;

public class j03TestStringBuilderMethods {

	public static void main(String[] args) {

		
		// append() -- Return a String Builder Object -- It is a overloading method , we can append any data 
		StringBuilder sb1 = new StringBuilder("Shibaram");
		String s1 = "Rout";
		String s2 = "BBSR";
		int i1 = 100;
		boolean b1 = true;
		StringBuilder sba = sb1.append(s1);
		//sb1.append(s1).append(s2);
		//sb1.append(b1);
		System.out.println(sba);
		
		
		//insert() -- Return StringBuilder Object -- It is a overloading method, we can insert any data
		String s3 = "JavaConceptOfDay";
		StringBuilder sb2 = new StringBuilder(s3);
		StringBuilder sbb = sb2.insert(3, "BUILDER" );
		System.out.println(sbb);
		
		
		//replace() -- Return StringBuilder Object
		String r1 = "QQQQ";
		StringBuilder sb3 = new StringBuilder("JavaConceptOfDay");
		StringBuilder sb4 = new StringBuilder("JavaConceptOfDay");
		StringBuilder sbc = sb3.replace(4, 10, "xxxxx");
		StringBuilder sbd = sb4.replace(4, 10, r1);
		System.out.println(sbc);
		System.out.println(sbd);
		
		
		//delete() -- Return StringBuilder Object 
		StringBuilder sb5 = new StringBuilder("JavaConceptOfDay");
		StringBuilder sbe = sb5.delete(4, 13);
		System.out.println(sbe);
		
		
		//deleteCharAt(index)-- Return StringBuilder Object 
		StringBuilder sb6 = new StringBuilder("JavaConceptOfDay");
		StringBuilder sbf = sb6.deleteCharAt(14);
		System.out.println(sbf);
		
		
		//reverse() -- Return StringBuilder Object
		StringBuilder sb7 = new StringBuilder("JavaConceptOfDay");
		StringBuilder sbg = sb7.reverse();
		System.out.println(sbg);
		
		
		//length() -- Return int
		StringBuilder sb8 = new StringBuilder("JavaConceptOfDay");
		int x = sb8.length();
		System.out.println(x);
		
		
		//subString() --Return String Object -- It is a overloading method
		StringBuilder sb9 = new StringBuilder("JavaConceptOfDay");
		String sbh = sb9.substring(4);
		String sbi = sb9.substring(4,10);
		System.out.println(sbh);
		System.out.println(sbi);
		
		
	
	}

}
