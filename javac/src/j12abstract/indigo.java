package j12abstract;

public class indigo extends Airbus
{

	public static void main(String[] args) {
		

	}

	@Override
	public void aeroDynamicBody() {
		System.out.println("it override only Airbus abstract method aeroDynamicBody()");
		
	}



	@Override
	public void aerEngine(int a) {
		System.out.println("it override only Airbus abstract method aerEngine(10)");
		
		
	}

	@Override
	public void aerEngine() {
		System.out.println("it override only Airbus abstract method aerEngine()");
		
	}

}
