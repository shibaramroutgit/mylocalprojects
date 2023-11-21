package j05staticandnonstatic;

public class StaticMethodTest {

	int age;
	static int id;
	
	public static void exampleF1()
	{
		System.out.println("In side Static Method");
		id = 222;
	}
	
	public static void main(String[] args) {
		
		System.out.println(StaticMethodTest.id); // Static variable are global so it allocated the default setting value (int  is it 0)
		

	}

}
