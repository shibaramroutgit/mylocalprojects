package j15generics.j06inheritance;

public class GenericSuperClass <T>{
	
	//Generic super class with one type parameter
	
	//Generic Class can extends a non generic class
	//Generic Class can extends a Generic Class but conditions are
	//		Super Class must have same type of generic type as sub class has
	//		Super Class at list sub type of generic types as sub class has
	//		If types not match compile error 

	public static void main(String[] args) {
		
		
	}
	

}


 
class GenericSubClass1<T> extends GenericSuperClass<T>
{
    //sub class with same type parameter
}
 
class GenericSubClass2<T, V> extends GenericSuperClass<T>
{
    //sub class with two type parameters
}
 
//class GenericSubClass3<T1, T2> extends GenericSuperClass<T>
//{
    //Compile time error, sub class having different type of parameters
//}