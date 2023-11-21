package j28pratice.j28p3;

public class SubC extends SuperC{
    public int a=10;
    public final int b=0;
    public void f1()
    {
        final int c;
        System.out.println("from SubC");
    }

    public static void main(String[]args)
    {
        final int abc;

        SubC sbC1 = new SubC();
        SubC sbC2 = new SubC();
        SuperC superC1 = new SuperC();
        SuperC superC2 = sbC2;
        sbC1.f1();
        superC1.f1();
        superC2.f1();

    }
}
