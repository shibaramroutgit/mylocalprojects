package j11arrays;

public class j02TestArrayObjects {

	public static void main(String[] args) {
		
		// Derive Type Data
		EmpData e1 = new EmpData(30,"shiba","BBSR");
		EmpData e2 = new EmpData(40,"gopal","CUTT");
		EmpData e3 = new EmpData(50,"raju","KALCTA");
		EmpData e4 = new EmpData(35,"sadhu","BERHAM");
		
		
		//EmpData [] ed1 = new EmpData[3];
		  EmpData [] ed1 = {e1,e2,e3,e4};
		for(EmpData d1 : ed1)
		{
			System.out.println(d1.age +"-"+d1.name+"-"+d1.city);
		}
	}

}

class EmpData
{

	int age;
	String name;
	String city;
	
	public EmpData()
	{
		
	}
	
	public EmpData(int a, String b,String c)
	{
		this.age=a;
		this.name=b;
		this.city=c;
	}
	
}