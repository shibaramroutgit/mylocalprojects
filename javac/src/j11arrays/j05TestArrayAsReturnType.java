package j11arrays;

public class j05TestArrayAsReturnType {

	
	
	
	//Method Returning An Array Primitive
	public String [] arrayAsReturTypeF1()
	{
		String [] s1 = {"Hari","Gopal","Sadhu","Madhu"};
		return s1;
		
	}
	
	
	//Method Returning An Array Derive Type
	public TestBank [] arrayAsReturTypeF2()
	{
		TestBank [] tb = new TestBank[4];
		TestBank o1 = new TestBank(10,"Harihara Bank");
		TestBank o2 = new TestBank(11,"Jayapur Bank");
		TestBank o3 = new TestBank(12,"Sayanyak Bank");
		TestBank o4 = new TestBank(13,"Saraswathi Bank");
		tb[0]=o1;
		tb[1]=o2;
		tb[2]=o3;
		tb[3]=o4;
		return tb;
			
	}
	
	public static void main(String[] args) {
		
		j05TestArrayAsReturnType aat1 = new j05TestArrayAsReturnType();
		String [] news1 = aat1.arrayAsReturTypeF1();
		for(String s:news1)
		{
			System.out.println(s);
		}
		System.out.println("==========================");
		
		TestBank[] tb1 = aat1.arrayAsReturTypeF2();
		for(TestBank b:tb1)
		{
			System.out.println(b.name+"-"+b.num);
		}
		
	}

}

class TestBank
{
	int num;
	String name;
	
	public TestBank()
	{
		
	}
	
	public TestBank(int a,String b)
	{
		this.num=a;
		this.name=b;
	}
	
}
