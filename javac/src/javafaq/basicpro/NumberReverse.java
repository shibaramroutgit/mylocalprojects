package javafaq.basicpro;

public class NumberReverse {
    public static void main(String[] args)
    {
        int num=235;
        int revNum=0;
        while (num>0)
        {
            int n = num%10;
            revNum = n+(revNum*10);
            num = num/10;
        }
        System.out.println(revNum);

    }
}
