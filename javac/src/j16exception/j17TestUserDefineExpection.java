package j16exception;

public class j17TestUserDefineExpection {

	
	public int acceptAge(int a)
	{
		return a;
	}
	public static void main(String[] args) throws j17TestAgeNagativeExpection {
		
		j17TestUserDefineExpection obj1 = new j17TestUserDefineExpection();
		int age = obj1.acceptAge(10);
		
		try{
			if (age<18)
			{
			j17TestAgeNagativeExpection nage= new j17TestAgeNagativeExpection("Age is below 18");
			throw nage;
		}else
		{
			System.out.println("Age is 18 or above");
		}
		}catch(j17TestAgeNagativeExpection ex)
		{
			System.out.println("Handel User Exception");
		}

	}

}
