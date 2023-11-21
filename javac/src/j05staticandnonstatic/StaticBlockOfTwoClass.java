package j05staticandnonstatic;


public class StaticBlockOfTwoClass {

	 static
     {
          System.out.println("MainClass SIB-1");
     }
 
     
     public static void main(String[] args)
     {
         //Static Members directly accessed with Class Name
          StaticComponents.staticVariable = 20;
          StaticComponents.staticMethod();
     }
     
     

}

class StaticComponents {
	static int staticVariable;
	 
    static
    {
         System.out.println("StaticComponents SIB-2");
         staticVariable = 10;
    }

    static void staticMethod()
    {
         System.out.println("From StaticMethod-3");
         System.out.println("StaticComponents variable 4:" +staticVariable);
         
    }

}