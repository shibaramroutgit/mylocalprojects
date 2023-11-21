package j14interface;

public interface BusInterface {
	
	public static String bustype ="AC BUS";
	// variables - interface level member are by default "public static final"
	//As final is mandatory to initialization so we add value 
	// If we not do it throw compile error
	
	public abstract void busEngine();
	public abstract void busdisplay();
	public  void busestart();
	
	// All method are by default public abstract because interface 100% abstract , so declare with abstract keyword is optional
	//Where as in Abstract call else it mandatory because abstract class hold abstract and non abstract method 
	// While implements interface in a class , we cannot reduce access modifier, it is because of Method Override concept
	// If we not declare correct , it throw compile error 
	// We can not declare static modifier on method it is because without body of static method not in use 
	
	
	
		/*
		 * static {
		 * 
		 * }
		 */
		
		/*
		 * {
		 * 
		 * }
		 */

	//Static and non static Initialization block not allow in interface because all variable are public static final and method are abstract 
}
