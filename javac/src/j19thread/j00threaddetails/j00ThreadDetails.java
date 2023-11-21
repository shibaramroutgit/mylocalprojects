package j19thread.j00threaddetails;

public class j00ThreadDetails {
	// Process : collective / sequence of actions to execute
				// When we run video files and working on word , are called process based multiple tasking
	// Thread : Thread is a small unit if action from a process and execute independently and complete
				// When we're Working on word document and give print command to print a Word document, are running in 2 threads. it is called thread base multitasking

    // java.lang.Thread Class :
                // it is the parent thread class
                // we can create a user define thread by extends "Thread" class and override the "run()" method
    // Create Thread:
                // Create a user define thread by extends "Thread" Class
                // Create a user define thread by implements "Runnable" i=Interface
                // Both "Thread" and "Runnable" has "run()" method to override
                // To initialization a object we can pass teh class into "Thread" class constructor
                // To execute the thread call "start()" method
    // Thread Types
                // User Thread
                        // It is User define thread , JVM will not exit until it close
                        // We can change the property type of User thread (Thread Class Object.SetDaemonThread(true)
                        // We can change the property before start the thread , After start if we try , it is IllegalThreadStateException at run time
                        // We can check a thread is a user define or daemon thread using isDaemon() method , return boolean
                // Daemon Thread
                        // It is created by JVM , to manage the internal process of JVM
                        // JVM close the execution of program without end the Daemon Thread ends

    // Thread Methods
                // setName(name) - user define thread class object.setName(name). we can set at any stage of thread
                // getName() - It use to get the name of thread , if we not set name, then JVM give "thread-number" number start from 0
                // currentThread() - it return the parent thread (main thread). user define thread class object.currentThread()
                // getId() - It return is of the thread . user define thread class object.currentThread().
                            // Thread ID created when thread is initialization
                            // Thread ID never change
                            // ID provide by JVM only
                // getPriority() - Final method and use to  get priority
                // setPriority() - Final method and use to set priority
                            // Default Priority is 5, min priority is 1 and max priority 10
                            // AT run time give out of range priority to set then IllegelArgumentException
                            // AT run time unable to set priority then SecurityException
                            // Thread object.currentThread().getPriority();

    //Sleep
            // public static void sleep() throw InterruptedException exception, so call by class name Thread
            // Accept in millisecond as parameter sleep(100);
            // always it sleep the main thread when we do Thread.sleep(3000)
    //join
            //IT throw Interrupted Exception
            // join() & join(millisecond)
            // Join() wait till the called thread end then it start else it throws exception

    //Thread State
            // Before calling the thread but Thread initialization is done then it is NEW STATE
            // After calling the thread with start() thread is in RUNNABLE STATE
            // When Thread is waiting for a synchronized object to access , it is BLOCKED STATE
            // When thread is with join() or sleep() is in WAITING STATE
            // When Thread is end it is TERMINATED STATE

    //Interrupt / Stop
            //  the thread at desired place using interrupt() method
            // thread object.interrupt()


}
