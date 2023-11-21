package j13inheritance;

public class Father {
	static int age;
	static long mob;
	String name;
	
	// Static initialization block is used to initialization static instance variable
	// It execute automatic on constructor call
	static{
		age=20;
		//name="shibaram"; //Not allow 
		mob=112233445566L;
		
	}

	public static void main(String[] args) {
		// when we call without object it display default value 
		System.out.println(Father.age);
		//On object create non static initialization execute 
		Father f1 = new Father();
		System.out.println(f1.age);
		System.out.println(f1.name);
	

	}

}
