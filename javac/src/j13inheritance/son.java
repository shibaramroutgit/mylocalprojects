package j13inheritance;

public class son extends Father{

	public static void main(String[] args) {
		
		son s1 = new son();
		System.out.println(s1.name);// It is non static so it is not initialization 
		System.out.println(s1.age);
		System.out.println(s1.mob);

	}

}
