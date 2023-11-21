package j19thread.j04jointhread;

public class j04JoinThread {

    public static void main(String [] args)  {
        j01ThreadA a1 = new j01ThreadA();
        j01ThreadA a2 = new j01ThreadA();
        j01ThreadA a3 = new j01ThreadA();

        a1.start();
        try{
            a1.join();
            System.out.println(a1.getName());
        }catch(InterruptedException ix)
        {

        }
        a2.start();
        try {
            a2.join();
            System.out.println(a2.getName());
        }catch (InterruptedException ix)
        {
            System.out.println(ix.getMessage());
        }
        a3.start();
        System.out.println(a3.getName());




    }
}
