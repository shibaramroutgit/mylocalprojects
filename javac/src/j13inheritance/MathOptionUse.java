package j13inheritance;

public class MathOptionUse extends MathOption{
	
	@Override
	public void add(int a, int b) {
		int c = a+b*100;
		System.out.println("add() from OptionUse class "+c);
		
	}
	
	public static void main(String[] args) {
		
		//Super class reference hold sub class object , in this case system call sub class overridden method if it is present in sub class else call from super class
		
		MathOptionUse o1 = new MathOptionUse();
		o1.add(10, 2); // when we call method using sub class object, it call from same class method
		
		MathOption m1 = o1; // when we call method using super class reference which hold sub class object , still it call sub class method
		o1.add(10, 2);
		
		MathOption u2 = new MathOption(); // when we call method using super class object then it call super class method if it override in sub class
		u2.add(10, 2);
		
		
		
	}


}
