package j19thread.j01createthread;

public class j01ByThreadClass extends Thread{

    @Override
    public void run() {
        super.run();
        for(int i=11; i<20;i++)
        {
            System.out.println(i);
        }
    }
}
