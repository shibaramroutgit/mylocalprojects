package j01controlflow;

public class SwitchStatements {
	
	String name="shiba";
	int num = 30;
	
	public void example1()
	{
		switch(name)
		{
		case "Hari":
			System.out.println("He is Hari");
		case "Gopal":
			System.out.println("He is Gopal");
		case "Dasa":
			System.out.println("He is Dasa");
		case "shiba":
			System.out.println("He is siba");
		default:
			System.out.println("Not Match any value");
		}
		// if not match any value then default will run 
		// if any match then all case below from the match statement will execute because we did not add break
	}

	
	public void example2()
	{
		switch(num)
		{
		case 10:
			System.out.println("it is 10");
			break;
		case 20:
			System.out.println("it is 20");
			break;
		case 30:
			System.out.println("it is 30");
			break;
		case 40:
			System.out.println("it is 40");
		default:
			System.out.println("No value Match");
		
		}
	}
	
	public static void main(String[] args) {
		SwitchStatements sso = new SwitchStatements();
		//sso.example1();
		sso.example2();

	}

}
