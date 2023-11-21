package j05staticandnonstatic;

public class StaticExecutionFlow {
	
	static {
		System.out.println("Static Block from ClassD");// Step 2 -Higher Preference to static block so it execute 1st and print 
	}
	

	public static void main(String[] args) // Step 1-Execution Starts from main () Method
	{
		System.out.println(ClassE.age);//Step 3 It start execute static Main() method and got the reference of Class E so execution jump to CLassE
		ClassE.age=40; //  Step 5 it execute and assigned value 
		ClassE.exampleF1(); // Step 6 it execute and control again go to ClassE static method "exampleF1()"
		
		

	}

}



class ClassE
{
	
	static int age;
	
	public static void exampleF1()  //Step 7 it execute and end the process as no code to execute 
	{
		System.out.println("Static Method exampleF1 from class ClassE");
		System.out.println(ClassE.age);
		ClassE.age=20;
		System.out.println(ClassE.age);
	}
	static { // Step 4 As static block higher preference than static Main(), it execute and print  
		System.out.println("Static block  from class ClassE");
		System.out.println(ClassE.age);
		ClassE.age=30;
	}
	
	
}