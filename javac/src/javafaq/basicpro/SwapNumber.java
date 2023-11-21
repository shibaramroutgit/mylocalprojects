package javafaq.basicpro;

public class SwapNumber {

    public static void main(String[] args)
    {
        int n1 = 10;
        int n2 = 20;
        System.out.println("n1="+n1+"and n2="+n2);
        n2 = n1+n2;
        n1 = n2-n1;
        n2 = n2-n2;
        System.out.println("n1="+n1+"and n2="+n2);
    }
}
