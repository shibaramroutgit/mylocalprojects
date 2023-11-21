package j10string.j01stringclass;

public class j04TestStringConcatenation {

	public static void main(String[] args) {
		
		
		// Add 2 string using concat()
		String sx1 = "Berhampur";
		String sx2 = "Odisha";
		String sx3 = sx1.concat(sx2);
		System.out.println(sx3);
		
		
		//Concatenation of String---1
		char [] c1 = {'r','o','u','t'};
		String s2 = new String("Shiba");
		String s3 = "ram";
		String s4 = new String(c1);
		
		String s5 = s2+s3+s4;
		System.out.println(s5);
		
		
		//Concatenation of String---2
		String s6 = "shiba";
		int i = 10;
		double d = 234.58;
		
		String s7 = s6+i;
		System.out.println(s7);
		
		String s8 = s6+d;
		System.out.println(s8);
		
		boolean b1 = true;
		String s9 = s6+b1;
		System.out.println(s9);
		
		
		
		//Concatenation of String---3
		A ao1 = new A("ram");
		System.out.println(s6+ao1);
		B bo1 = new B("rout");
		System.out.println(s6+bo1);
		
		
		//Concatenation of String---4
		String sz1 = null;
		String sz2 = null;
		String sz3 = sz1+sz2;
		System.out.println(sz3);
		
		

	}

}

//--------------------------------------------------
class A
{
	String i;
	public A(String i)
	{
		this.i=i;
	}
	
}

class B
{
	String i;
	public B(String i)
	{
		this.i=i;
	}
	
	@Override
	public String toString()
	{
		return i;
		
	}
}
