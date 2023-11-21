package j28pratice.j28p2;

public class PrimeTest {

    public static void main(String[] args)
    {
        int num = 5;
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count+=1;
                System.out.println(count);
            }

        }
        if(count==2)
        {
            System.out.println(" Prime");
        }else {
            System.out.println("Not Prime");
        }
    }
}
