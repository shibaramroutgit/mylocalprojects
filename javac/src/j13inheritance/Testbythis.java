package j13inheritance;

public class Testbythis
{

	int pdnum;
	int pagenum;
	public Testbythis()
	{
		System.out.println("Zero Argument Constructor of MathTeacher");
	}
	
	public Testbythis(int a)
	{
		this(); // it call same class zero argument constructor 
		this.pdnum=a; // this represent to current class object 
		System.out.println("1 Argument Constructor of MathTeacher");
	}
	
	public Testbythis(int a, int b)
	{
		this(100); //it call same class 1 argument constructor
		this.pdnum=a; // this represent to current class object 
		this.pagenum=b;
		System.out.println("2 Argument Constructor of MathTeacher");
	}
	public static void main(String[] args) {
		
		Testbythis m1 = new Testbythis();
		System.out.println(m1.pagenum);
		System.out.println(m1.pdnum);
		Testbythis m2 = new Testbythis(10,20);
		
	}

}

