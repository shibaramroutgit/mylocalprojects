package j04finalkey;

public class TestFinalArray {
	
	
	final String name [] ={"Shibaram","Gopal","Sanjay","Hari"};
	final int num1 [] = new int [10];
	 int num2 [] = new int [10];
	 int num3 [] = new int [10];

	public static void main(String[] args) {
		TestFinalArray a1 = new TestFinalArray();
		System.out.println("Orignal Data of Array Belore Change");
		
		for(String s:a1.name)
		{
			System.out.println(s);
		}
		
		// Array is declare as final but its elements can change 
		
		for(int i=0; i<a1.name.length;i++)
		{
			
				a1.name[2]="Sanjay Mohanty";
		}
		System.out.println("Orignal Data of Array After Change");
		
		for(String s:a1.name)
		{
			System.out.println(s);
		}
		
		// Array object cannot change 
		//a1.num1 = a1.num2; // not allow because array is final and we try to change object reference 
		a1.num2 = a1.num3;
		
	}

}
