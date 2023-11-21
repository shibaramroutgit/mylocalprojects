package j19thread.j04jointhread;

public class j02ThreadB extends  Thread{


    @Override
    public void run() {
        super.run();
        for(int j=10;j<100;j=j+10)
        {
            System.out.println("Thread B="+j);
        }
    }
}
