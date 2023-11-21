package j19thread.j04jointhread;

public class j01ThreadC extends Thread{

    @Override
    public void run() {
        super.run();
        for(int i=100;i<1000;i=i+100)
        {
            System.out.println("Thread C="+i);
        }
    }
}
