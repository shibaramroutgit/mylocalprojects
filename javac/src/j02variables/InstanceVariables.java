package j02variables;

public class InstanceVariables {

	int age;
	String name;
	static String country ="India";
	static int countryCode = 91;
	
	InstanceVariables(int a, String b)
	{
		this.age=a;
		this.name=b;
	}
	
	
	//the variable declare inside class as static, then it  called class level variable
	//Class variables are common to all instances of a class i.e these variables will be shared by all objects of a class. 
	//Hence, changes made to these variables through one object will reflect in all objects
	//Static variable can access by class name directly 
	public static void main(String[] args) {
		
		//Static variable access by class name
		System.out.println(InstanceVariables.country);
		System.out.println(InstanceVariables.countryCode);
		
		//Static variable access by class object 
		InstanceVariables iv1 = new InstanceVariables(10,"Shibaram");
		System.out.println(iv1.age);
		System.out.println(iv1.name);
		System.out.println(iv1.country);
		System.out.println(iv1.countryCode);
		
		InstanceVariables iv2 = new InstanceVariables(20,"Gopal");
		System.out.println(iv2.age);
		System.out.println(iv2.name);
		System.out.println(iv2.country);
		System.out.println(iv2.countryCode);
		
		//Any change made on static variable accessible to all class object because it is common
		
		InstanceVariables iv3 = new InstanceVariables(30,"Jadhu");
		iv3.country="UK";
		iv3.countryCode= 44;
		
		System.out.println("Object a1-"+iv1.country);
		System.out.println("Object a1-"+iv1.countryCode);
		
		System.out.println("Object a2-"+iv2.country);
		System.out.println("Object a2-"+iv2.countryCode);
		
		System.out.println("Object a3-"+iv3.country);
		System.out.println("Object a3-"+iv3.countryCode);

	}


}
