package j12abstract;

public abstract class Airplane extends Airbus
{
	// Airplane & Airbus both are abstract class so on extends , it is optional to sub class to define body
	// Even if abstract sub class define, it consider as a method of sub class
	public abstract void aerospace();
	public abstract void aeroapproval();
	public abstract void aeroassemble();
	
	
	
	public static void main(String [] agrs)
	{
		System.out.println("not fource to overide" );
	}
	
	

}
