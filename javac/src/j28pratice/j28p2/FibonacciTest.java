package j28pratice.j28p2;

public class FibonacciTest {

    public static void main(String [] args)
    {
        int num=20;
        int firstTerm=0;
        int secondTerm=1;
        for(int i=1;i<=10;i++)
        {
            System.out.println(firstTerm);
            int  nextTerm = firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;

        }
    }
}
