package j13inheritance;



public class InheritanceOutpackageClass extends FatherInLaw{

	public static void main(String[] args) {
		FatherInLaw g1 = new FatherInLaw();
		System.out.println(g1.age);//public modifier - so access 
		g1.exampleF1();
		
		//System.out.println(g1.empID);//default and sub-class in outside package - so it not access 
		//g1.exampleF2();
		
		//System.out.println(g1.name); ///protected and sub-class in out side same package - so it not access
		//g1.exampleF3();
		// BUT by sub class object we can access protected member 
		
		InheritanceOutpackageClass i1 = new InheritanceOutpackageClass();
		System.out.println(i1.name);
		i1.exampleF3();
		
		//System.out.println(g1.salary);// private so it is not accessible on inheritance 
		//g1.exampleF4();

	}

}
