package j13inheritance;


public class Student extends Teacher{
	String name;
	
	public void teacherInfo()
	{
		System.out.println(super.id); // super refer to "Teacher" class
		System.out.println(super.name); // super refer to "Teacher" class
	}
	public Student()
	{
		// default it call super() as Teacher class zero argument constructor
		//super() is first line always - else compile error 
		System.out.println("Student Class Constructor zero argument");
	}
	
	public Student(String a)
	{
		super(101,"GopalMaster");
		// default it call super() as Teacher class zero argument constructor
		//super() is first line always - else compile error 
		//We can manually call desired constructor of super class (Teacher) 
		System.out.println("Student Class Constructor 1 argument");
		this.name=a;
	}
	public static void main(String[] args) {
		
		System.out.println("call 1=======");
		Student s1 = new Student();
		System.out.println("call 2=========");
		Student s2 = new Student("Ravi");
		
	}

}
