package j15generics.j04bounded;

public class GenericBoundedMethod {

	static Integer [] ia = {10,20,30,40,50};
	static Long [] la = {123344566L,897366373L,637366364673283L,25627379898L};
	static Double [] da = {123.45,4674.8798,5345.569};
	
	public static void main(String[] args) {
		
		GenericBoundedMethod gbm1 = new GenericBoundedMethod();
		gbm1.printElements(ia);
		System.out.println("--------------------------");
		gbm1.printElements(la);
		System.out.println("--------------------------");
		gbm1.printElements(da);
		
		
	}
	
	public  <E extends Number>void printElements(E [] e)
	{
		for(E ex:e)
		{
			System.out.println(ex);
		}
	}

	
	
}
