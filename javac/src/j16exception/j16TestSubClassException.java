package j16exception;

import java.io.IOException;
import java.sql.SQLException;

public class j16TestSubClassException extends j16TestSuperClassException
{

	// Case 1: When a Super Class Method not throw any exception but at Override sub class  throw exception
	@Override
	public void exampleF1() throws NullPointerException
	{
		System.out.println(10);
	}
	
	
	
	// Case 2: When a Super Class Method not throw any exception but at Override sub class  can not throw checked exception
	@Override
	public void exampleF2() //throws SQLException
	{
		System.out.println("Shiba");
	}
		
		
	// Case 3: When a Super Class Method throws a unchecked exception then at Sub Class can override with same or any other unchecked exception 
	public void example3() throws ArrayIndexOutOfBoundsException, NullPointerException
	{
		System.out.println("Shiba");
	}	
	
	
	
	
	// Case 3: When a Super Class Method throws a checked exception then at Sub Class can override with same or sub class  exception . 
	// we can decrease the scope of exception in sub class but we cannot increase the scope of exception 
	public void example4() throws IOException // FileNotFoudException
	{
		System.out.println("Shiba");
	}
	
	
	
	
	public static void main(String[] args) 
	{
		j16TestSubClassException obj1 = new j16TestSubClassException();
		obj1.exampleF1();
		
	}

}
