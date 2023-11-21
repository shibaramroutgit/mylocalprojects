package j11arrays;

import java.util.Arrays;

public class j03TestCopyArray {
	
	//Copy by Array1 = Array2
	public void examplCopyF1()
	{
		int [] a1 = {1,2,3,4,5,6};
		int [] a2;
		a2=a1;
		for(int i:a2)
		{
			System.out.println(i);
		}
	}
	
	
	//Copy using For Loop by Index
	public void examplCopyF2()
	{
		String [] a1 = {"Hari","Gopal","Madhu","Sadhu"};
		String [] a2 = new String[a1.length];
		for(int i=0;i<a1.length;i++)
		{
			a2[i]=a1[i];
		}
		
		for(String s:a2)
		{
			System.out.println(s);
		}
	}
	
	
	//Copy by Arrays.copyOf(From Array Name to get data,  To Array Length)
	public void examplCopyF3()
	{
		char [] a1 = {'s','h','i','b','a'};
		char [] a2 = Arrays.copyOf(a1,a1.length); // Manually we can enter new array size
		
		for(char s:a2)
		{
			System.out.println(s);
		}
	}
	

	//Copy by clone()
	public void examplCopyF4()
	{
		char [] a1 = {'s','h','i','b','a'};
		char [] a2 = a1.clone();
		
		for(char s:a2)
		{
			System.out.println(s);
		}
	}
		
		
		
	//Copy by arrayCopy (source_arr, sourcePos, dest_arr,destPos, dest_len)
	public void examplCopyF5()
		{
			int [] s1 = {1,2,3,4,5,6,7,8,9,10};
			int [] d2 = {11,12,13,14,15,16,17,18,19,20};
					
			System.arraycopy(s1, 3, d2, 3,6 );
			for(int i :d2)
			{
				System.out.println(i);
			}
		}
		
		
	public static void main(String[] args) {
		
		j03TestCopyArray acy1 = new j03TestCopyArray();
		System.out.println("------------F1------------");
		acy1.examplCopyF1();
		System.out.println("------------F2------------");
		acy1.examplCopyF2();
		System.out.println("------------F3------------");
		acy1.examplCopyF3();
		System.out.println("-------------F4-----------");
		acy1.examplCopyF4();
		System.out.println("-------------F5-----------");
		acy1.examplCopyF5();
	}

}
