package j03operator;

public class assignmentoperators {

	
	//	=		a = b;		a = b;
	//	+=		a += b;		a = a + b;
	//	-=		a -= b;		a = a - b;
	//	*=		a *= b;		a = a * b;
	//	/=		a /= b;		a = a / b;
	//	%=		a %= b;		a = a % b;
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int c;
		
		c = a;
		System.out.println("c = a:-" + c);
		c +=b;
		System.out.println("c = c+b:- "+ c);
		c -=b;
		System.out.println("c = c-b:- "+ c);
		c *= a;
		System.out.println("c = c*a:- "+ c);
		c /=b;
		System.out.println("c = c/b:- "+ c);
		c %=a;
		System.out.println("c = c%a:- "+ c);
		
		

	}

}
