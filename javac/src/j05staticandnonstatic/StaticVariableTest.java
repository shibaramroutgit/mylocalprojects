package j05staticandnonstatic;

public class StaticVariableTest {
	
	// Static can use with variable, method and block{}
	// Static member store in class memory, so we can access with class name. Class object is not required.by object also we can access
	// any changes on static member it reflect on each object because static member are common to all object
	
	//static variable load in class memory and common to all object
	static String location = "BBSR";
	int age,id;
	String name,role;
	
	public StaticVariableTest(int i1, int i2, String s1, String s2)
	{
		this.age=i1;
		this.id=i2;
		this.name=s1;
		this.role=s2;
	}
	
	public static void main(String[] args) {
		
		StaticVariableTest a1 = new StaticVariableTest(30,111,"Shibaram","Manager");
		StaticVariableTest a2 = new StaticVariableTest(30,111,"Shibaram","Manager");
		// Static so it is accessible to all object
		System.out.println("Access by object a1-"+a1.location);
		System.out.println("Access by object a1-"+a2.location);
		// It is common so value change by a object it reflect to all object 
		System.out.println("Static Variable value chnage");
		a1.location="Cuttack"; // Asi 
		System.out.println("Access by object a1-"+a1.location);
		System.out.println("Access by object a1-"+a2.location);

	}

}
