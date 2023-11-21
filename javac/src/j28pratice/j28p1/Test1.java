package j28pratice.j28p1;

public class Test1 extends Thread
{
    @Override
    public void run() {
        System.out.println("Thread runs...");
    }

    public static void main(String [] args)
    {
        Test1 t1 = new Test1();
        t1.start();
    }
}
