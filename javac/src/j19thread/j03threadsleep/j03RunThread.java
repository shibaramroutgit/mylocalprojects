package j19thread.j03threadsleep;



public class j03RunThread {

    public static void main(String [] args) throws InterruptedException {
       j01ThreadA a = new j01ThreadA();
        j02ThreadB b = new j02ThreadB();

        a.start();
        Thread.sleep(2000);
        b.start();



    }
}
