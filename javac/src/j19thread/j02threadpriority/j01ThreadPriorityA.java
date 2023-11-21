package j19thread.j02threadpriority;

public class j01ThreadPriorityA extends Thread{

    @Override
    public void run() {
        super.run();
        for (int j= 100;j<110;j++)
        {
         System.out.println(j);
        }
    }



}
