package javafaq.basicpro;

public class PrimeNumber {
    public static void main(String[] args)
    {
        int num=18;
        int count=0;
        for (int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count=count+1;
            }
        }
        if(count>2)
        {
            System.out.println(num+"-Not Prime");
        }else {
            System.out.println(num+"-Prime");
        }
    }
}
