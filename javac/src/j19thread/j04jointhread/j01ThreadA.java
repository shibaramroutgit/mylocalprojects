package j19thread.j04jointhread;

public class j01ThreadA extends Thread{

    @Override
    public void run() {
        super.run();
        for(int i=1;i<9;i++)
        {
            System.out.println("Thread A="+i);
        }
    }
}
