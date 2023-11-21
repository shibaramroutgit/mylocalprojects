package j13inheritance;

public class Collage extends University{

	
	//Case 1:: Constructor of super class not inherited to sub-class but super class constructor execute when we call sub class constructor
	//It is recommended Super has default / zero argument constructor  else manually we need to specify super(parameter) constructor 
	/*
	 * Collage() { System.out.println("Collage- Zero  Argument COnstructor");
	 * 
	 * }
	 */
	 

	
	// Case 2 :: Manually call desired super class constructor 
	Collage ()
	{
		//this() or super() always first line of code 
		//super(1122334455L); // To call 1 argument constructor 
		super(1122334455L,"BerhampurU"); // To call 1 argument constructor 
	}

	public static void main(String[] args) 
	{
		Collage c1 = new Collage();
		

	}

}
