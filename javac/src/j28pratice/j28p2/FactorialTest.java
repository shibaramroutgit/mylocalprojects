package j28pratice.j28p2;

public class FactorialTest {

    public static void main(String [] args)
    {
        int num = 10;
        long fact = 1l;
        for(int i=1;i<=10;i++)
        {
            fact *= i;
        }
        System.out.println(fact);
    }
}
