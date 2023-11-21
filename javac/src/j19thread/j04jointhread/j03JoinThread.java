package j19thread.j04jointhread;

public class j03JoinThread {

    public static void main(String [] args) throws InterruptedException {
        j01ThreadA a = new j01ThreadA();
        j02ThreadB b = new j02ThreadB();
        j01ThreadC c = new j01ThreadC();

        a.start();
        a.join();
        b.start();
        b.join();
        c.start();




    }
}
