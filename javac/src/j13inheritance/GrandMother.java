package j13inheritance;

public class GrandMother {
	static int age;
	String name;
	
	// non static initialization block is used to initialization both static and non static instance variable
	// It execute automatic on object create
	{
		age=20;
		name="shibaram";
		
	}

	public static void main(String[] args) {
		// when we call without object it display default value 
		System.out.println(GrandMother.age);
		//On constructor call  non static initialization execute 
		GrandMother f1 = new GrandMother();
		System.out.println(f1.age);
		System.out.println(f1.name);
	

	}

}
