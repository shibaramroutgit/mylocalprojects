package javafaq.basicpro;

public class PalindromeNumber {
    public static void main(String[] args)
    {
        int num=222;
        int copNum=num;
        int resNum=0;
        while (num>0)
        {
            int n = num%10;
            resNum = n+(resNum*10);
            num=num/10;
        }
        if(resNum==copNum)
        {
            System.out.println(copNum+"- is Palindrome Number");
        }else {
            System.out.println(copNum+"- is Palindrome Number");
        }

    }
}
