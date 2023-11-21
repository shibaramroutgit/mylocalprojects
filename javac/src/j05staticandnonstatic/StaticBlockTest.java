package j05staticandnonstatic;

public class StaticBlockTest {
	
	static int age ;
	int id;
	
	//using static key word we create a block , it is use to allocate value to static variable .
	// In side static block only we can access static variables 
	static {
		System.out.println("Value added to static variable inside static block");
		age=30;
	}
	
	

	public static void main(String[] args) {
		
		System.out.println(StaticBlockTest.age);
	}

}
