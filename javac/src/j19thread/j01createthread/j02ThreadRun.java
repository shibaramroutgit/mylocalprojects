package j19thread.j01createthread;

public class j02ThreadRun {


    public static void main(String [] args)
    {
        j02ByRunnableInterface obj1 = new j02ByRunnableInterface(); // Initialization  a thread
        Thread tObj = new Thread(obj1); // Create a Thread

        tObj.start();

    }
}
