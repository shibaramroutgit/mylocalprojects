package j08constructor;

public class EmpSubclass extends DeptSuperclass{

	int empid;
	public EmpSubclass()
	{
		// By Default compiler call super() if we not add
		//super("Dasarathi"); we can call as per desired hen it call respective constructor 
		//super() is always first line -else compiler error 
		System.out.println("Sub-Class Class 0 Argument Constructor");
	}
	
	public EmpSubclass(int i)
	{
		this.empid=i;
		System.out.println("Sub-Class Class 0 Argument Constructor");
	}
	public static void main(String[] args) {
		
		EmpSubclass e1 = new EmpSubclass();
		//We call Employee class zero argument but compiler internally call super call zero argument constructor
		

	}

}
