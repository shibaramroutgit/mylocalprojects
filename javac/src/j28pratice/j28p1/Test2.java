package j28pratice.j28p1;

public class Test2 implements Runnable
{
    @Override
    public void run() {
        System.out.println("Thread runs...");
    }

    public static void main(String [] args)
    {
        Thread rx = new Thread(new Test1());
        rx.start();
    }
}
