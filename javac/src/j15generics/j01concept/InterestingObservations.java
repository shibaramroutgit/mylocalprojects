package j15generics.j01concept;

public class InterestingObservations {

	public static void main(String[] args) {
		

	}

}

//You can’t create an instance to the type parameters. 
//This is because, the type parameters does not exist at run time. 
//They are erased during compilation.
class GenericClassA<T>
{
    //T t = new T();     //Compile Time error
 
    <V> void genericMethod()
    {
        //V v = new V();     //Compile Time error
    }
}



//In generic class with type parameter ‘T’, you can’t declare static fields of type ‘T’
//and you can’t use ‘T’ in a static method
class GenericClassB<T>
{
    //static T t;        //Compile time error
 
    static void staticMethod()
    {
        //System.out.println(t);    //Compile time error
    }
 
    static <V> void genericMethod()
    {
        //Static generic method
    }
}




//You can’t instantiate an array whose type is a type parameter.
class GenericClassC<T>
{
    T[] t;        
 
    public GenericClassC(T[] t)
    {
       // t = new T[5];   //Compile time error
 
        this.t = t;     //But, This is OK
    }
}





//You can not create generic exceptions i.e A generic class can not extend Throwable or any of it’s sub classes.
class GenericClassD<T>  //extends Throwable
{
    //Compile time error
}



//You can’t create an array of generic type containing specific type of data. But, 
//you can create an array of generic type containing unknown type of data.
class GenericClassE<T>
{
        //Generic type
}
 
class GenericsInJava
{
    public static void main(String[] args)
    {
    	//GenericClassE<Number> gen[] = new GenericClassE<Number>[10];   //Compile time error
 
    	GenericClassE<?> gen1[] = new GenericClassE<?>[10];    //But, this is fine
    }
}