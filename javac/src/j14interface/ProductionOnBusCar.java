package j14interface;

public class ProductionOnBusCar implements CarInterface,BusInterface
{

	//using 'implements" keyword to use interface into a class
	//It allow to implements multiple interface at time using comma (,) separator
	//It is mandatory to override interface abstract method in implemented class 
	


	//As every  class extends Object class as default ,similar so such super interface for interface present but
	//Every public method of object class has its implicit abstract public method in object class so 
	//we can call object class public method using reference of an interface
	
	
	//Object we cannot create for a interface but sub class object can hold by interface reference
	public static void main(String[] args) {
		
		ProductionOnBusCar p1 = new ProductionOnBusCar();

		
		p1.busdisplay();
		p1.busEngine();
		p1.busestart();
		
		p1.cardisplay();
		p1.carEngine();
		p1.carestart();
	}

	

	@Override
	public void busEngine() {
		System.out.println("busEngine");
		
	}

	@Override
	public void busdisplay() {
		System.out.println("busdisplay");
		
	}

	@Override
	public void busestart() {
		System.out.println("busestart");
		
	}

	@Override
	public void carEngine() {
		System.out.println("carEngine");
		
	}

	@Override
	public void cardisplay() {
		System.out.println("cardisplay");
		
	}

	@Override
	public void carestart() {
		System.out.println("carestart");
		
	}
	
	

}
