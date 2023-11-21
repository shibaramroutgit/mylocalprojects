package j03operator;

public class ternaryoperators {
	
	
	// variable = (expression)? "on  true Case Value":"On not True Case Value";
	public static void main(String [] args)
	{
		int monthfebdays = 28;
		String yearType;
		yearType =(monthfebdays==25)? "Leap Year":"Not Leap Year";
		System.out.println(yearType);
		
		System.out.println("==========================");
		
		int age = 20;
		String voteType;
		voteType = (age>=20)? "You Can Vote":"You Can Not Vote";
		System.out.println(voteType);
	}

}
