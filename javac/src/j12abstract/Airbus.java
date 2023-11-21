package j12abstract;

public abstract class Airbus 
{
	
	// In abstract class method are mandatory to declare with abstract keyword because , this class accept both abstract and non abstract method
	// A interface can extends another abstract but it is not mandatory to override methods because both are abstract
	public abstract void aeroDynamicBody();
	public abstract void aerEngine();
	
	public abstract void aerEngine(int a); 
	// Abstract method can overloading 
	
	
	
	//public static abstract void aerEngine(); // compile time error 
	//Static says it is class level but abstract method has no body , so it has no use at class level
	
	
	// Constructor allow in abstract class but it is not in use because
	// Abstract lass not allow to create object and constructor are initialization class variable not for object create
	
	
	//private abstract void airnavigator();//Compile error 
	//Private not allow because abstract method use to override in sub class , if it private it not accessible sub class
	//Abstract class not allow to create object , so due to these conditions private method nt allow 
	
	
	public Airbus()
	{
		System.out.println("Constructor of Airbus");
	}
	
	
	
}
