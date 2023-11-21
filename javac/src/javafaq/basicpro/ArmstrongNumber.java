package javafaq.basicpro;

public class ArmstrongNumber {
    public static void main(String[] args)
    {
        int num=153;
        int copyNum=num;
        int numTotal=0;
        while (num>0)
        {
            int n = num%10;
            numTotal= (n*n*n)+numTotal;
            num=num/10;
        }
        if (copyNum==numTotal)
        {
            System.out.println(copyNum+"- Armstrong Number");
        }else {
            System.out.println(copyNum+"- NotArmstrong Number");
        }
    }
}

