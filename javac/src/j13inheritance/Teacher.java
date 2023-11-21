package j13inheritance;

public class Teacher {
	
	int id;
	String name;

	
	public Teacher()
	{
		System.out.println("Zero Constructor of Teacher Class");
	}
	public Teacher(int a, String b)
	{
		this.id=a;
		this.name=b;
		System.out.println("2 Argument Constructor of Teacher Class");
	}
	
	public void engClass()
	{
		System.out.println("Eng Class");
	}
	public static void main(String[] args) {
		
		Teacher t1 = new Teacher(103,"HariMaster");
		System.out.println(t1.id);
		System.out.println(t1.name);
		t1.engClass();
	}

}
