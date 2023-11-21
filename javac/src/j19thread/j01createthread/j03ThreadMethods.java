package j19thread.j01createthread;

public class j03ThreadMethods extends Thread{

    @Override
    public void run() {
        super.run();
        for(int i=1;i<10;i++)
        {
            System.out.println(i);
        }
    }


    public static void main(String [] args)
    {
        j03ThreadMethods obj1 = new j03ThreadMethods();
        boolean b1 = obj1.isDaemon();
        System.out.println(b1);
        obj1.setDaemon(true);
        boolean b2 = obj1.isDaemon();
        System.out.println(b2);
        //obj1.start();
        //obj1.setDaemon(true); // After start the thread we change property so IllegalThreadStateException

        j03ThreadMethods obj2 = new j03ThreadMethods()  ;
        obj2.setName("Thread2");
        String tn = obj2.getName();
        System.out.println(tn);
       long l1= obj2.getId();
       System.out.println(l1);
        Thread t = Thread.currentThread();
        long ID = t.getId();
        System.out.println(ID);
    }
}
