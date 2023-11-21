package j15generics.j02class;


// When we declare class is generic it means any object type can assigned to this class
// When class declare generic , we need to use same generic type inside class
public class TestGenClass <T>
{
	//Class Variables
	T num;
	T name;
	
	//Class Constructor
	public TestGenClass(T i, T s)
	{
		this.num=i;
		this.name=s;
	}
	
	//Class Method
	public void createID()
	{
		System.out.println(this.num);
		System.out.println(this.name);
	}
	
	public static void main(String[] args) {
		
		TestGenClass tg1 = new TestGenClass(101,"Shibaram");
		System.out.println(tg1.name);
		System.out.println(tg1.num);
		System.out.println("------------------------------");
		
		TestGenClass tg2 = new TestGenClass(101.25,'c');
		System.out.println(tg2.name);
		System.out.println(tg2.num);
		System.out.println("------------------------------");
		
		TestGenClass tg3 = new TestGenClass(1122334455,10000);
		System.out.println(tg3.name);
		System.out.println(tg3.num);
		System.out.println("------------------------------");

	}

}
