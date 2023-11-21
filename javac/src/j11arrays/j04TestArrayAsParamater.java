package j11arrays;

public class j04TestArrayAsParamater {
	
	
	
	//Passing Array Of Primitive Type As A Parameter to The Method
	public void addElementToArray(double [] d2) // Receiving array as Parameter
	{
		d2[0]=10.11;
		d2[1]=11.12;
		d2[2]=12.13;
		d2[3]=13.14;
		
		for(int i=0;i<d2.length;i++)
		{
			System.out.println(d2[i]);
		}
	}
	

	
	//Passing Array Of Derive Type As A Parameter to The Method
	public void addObjectToArray(TestSchool [] as)
	{
		TestSchool o1 = new TestSchool(10,"Harihara School");
		TestSchool o2 = new TestSchool(11,"Jayapur School");
		TestSchool o3 = new TestSchool(12,"Sayanyak School");
		TestSchool o4 = new TestSchool(13,"Saraswathi School");
		as[0]=o1;
		as[1]=o2;
		as[2]=o3;
		as[3]=o4;
		
		for(TestSchool f:as)
		{
			System.out.println(f.name+"-"+f.num);
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		double [] d1 = new double[4];
		
		TestSchool [] ts1 = new TestSchool[4];
		
		j04TestArrayAsParamater rap1 = new j04TestArrayAsParamater();
		
		rap1.addElementToArray(d1); // Pass primitive data array as Parameter 
		System.out.println("===============================");
		rap1.addObjectToArray(ts1); // Pass derive data array as parameter 
		
		
		
	}

}

class TestSchool
{
	int num;
	String name;
	
	public TestSchool()
	{
		
	}
	
	public TestSchool(int a,String b)
	{
		this.num=a;
		this.name=b;
	}
	
}
