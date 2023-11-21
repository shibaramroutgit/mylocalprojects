package j13inheritance;

public class GrandSon extends GrandMother{

	public static void main(String[] args) {
		
		
		// non static initialization not inheritance to sub class
		//On object create non static initialization execute it is because
		// On sub-class object create , internally it call super() constructor 
		
		GrandSon s1 = new GrandSon();
		System.out.println(s1.age);
		System.out.println(s1.name);
	}

}
