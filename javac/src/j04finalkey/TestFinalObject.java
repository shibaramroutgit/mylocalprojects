package j04finalkey;

public class TestFinalObject {
	
	int age;
	String name;
	
	TestFinalObject()
	{
		System.out.println("0 Argument COnstructor");
	}

	TestFinalObject(int a, String b)
	{
		this.age=a;
		this.name=b;
		System.out.println("2 Argument COnstructor");
	}
	public static void main(String[] args) {
		
		TestFinalObject t1 = new TestFinalObject(101,"Shibaram");
		//Final object state can change
	final TestFinalObject t2 = new TestFinalObject(102,"Dasarathi");
	// Final Object we cannot change the address location by assigned a new object 
	//t2=t1;
	TestFinalObject t3 = new TestFinalObject(103,"Sibani");
	t1=t3; // it allow 

	}

}
