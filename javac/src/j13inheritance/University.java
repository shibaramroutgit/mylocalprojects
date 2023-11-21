package j13inheritance;

public class University {
	
	
	
	long phnum;
	String name;
	
	
	University() 
	  { 
		  System.out.println("University-Zero Argument Constructor"); 
	  }
	 
	
	
	University(long a)
	{
		this.phnum=a;
		System.out.println("University-1 Argument Constructor");
	}

	
	University(long a, String b)
	{
		this();// It is allow to call same class constructor using this() with or without parameter as per present constructor 
		this.phnum=a;
		this.name=b;
		System.out.println("University-2 Argument Constructor");
	}
	public static void main(String[] args) {
		
		//ClassD u1 = new ClassD();
		//ClassD u2 = new ClassD(10);
		University u3 = new University(9988776655L,"Shibaram");
		

	}

}
