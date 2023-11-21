package j03operator;

public class unaryoperators {
	
	//	++	Increment operator: increments value by 1
	//	--	Decrement operator: decrements value by 1
	// it can use post and pre of a variable 
	// post increment or decrement - will increase or decrement by 1 and assigned to variable
	// pre increment or decrement - will assigned the value to variable then increase or decrement by 1 
	
	
	public static void main (String [] args)
	{
		int a = 2, b = 4;
		System.out.println("Orignal a " + a);
		System.out.println("Orignal b " + b);
		a=b++;
		System.out.println("Now Value a " + a);
		System.out.println("Now Value b " + b);
		System.out.println("========================");
		
		int c = 3,d=6;
		System.out.println("Orignal c " + c);
		System.out.println("Orignal d " + d);
		c = ++d;
		System.out.println("Now Value c " + c);
		System.out.println("Now Value d " + d);
		System.out.println("========================");
		
		int e =4,f=8;
		System.out.println("Orignal e " + e);
		System.out.println("Orignal f " + f);
		e = f--;
		System.out.println("Now Value e " + e);
		System.out.println("Now Value f " + f);
		System.out.println("========================");
		
		int g=5,h=10;
		System.out.println("Orignal g " + g);
		System.out.println("Orignal h " + h);
		g = --h;
		System.out.println("Now value g " + g);
		System.out.println("Now Value h " + h);
	}

}
