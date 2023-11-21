package j19thread.j02threadpriority;

public class j02ThreadPriorityRun {



    public static void main(String [] args)
    {
        j01ThreadPriorityA p1 = new j01ThreadPriorityA();
        j01ThreadPriorityB p2 = new j01ThreadPriorityB();
        int i =  p1.getPriority();
        int j =  p2.getPriority();
        System.out.println("Priority of P1 Thread-"+i);
        System.out.println("Priority of P2 Thread-"+j);
        p2.setPriority(2);
        j =  p2.getPriority();
        System.out.println("New Priority of P2 Thread-"+j);
        p1.start();
        p2.start();
        long t = Thread.currentThread().getPriority();


    }
}
