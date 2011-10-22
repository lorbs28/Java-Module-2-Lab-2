/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lorbs28
 */
public class LabTwoDriver {

    public LabTwoDriver() {
    }
    
    
    public static void main(String args[]) {
        LabTwoDriver driver;

//        new SysLogger().init();  //initialize the logger for the system
        
        driver = new LabTwoDriver();
        driver.launchingThreads();
    }
    
    public void launchingThreads()
    {
        //the Thread extended thread class creation
        System.out.println("Creating and running the object instance for Lab Two class");
        LabTwo oMyThreadClass = new LabTwo("MyAlphabetThread");
        oMyThreadClass.start();  //starts the thread by telling the JVM to invoke that class' run()
        
        System.out.println("A thread is running");
        System.out.println("And now I can continue to process tasks in the owning thread");

        /*
        //the Runnable interface thread creation
        //notice that we need an instance of class Thread to run a Runnable class
        System.out.println("Creating and running the object instance for MyRunnableClass");
        LabOneRunnable oMyRunnableClass = new MyRunnableClass();
        Thread oThread = new Thread(oMyRunnableClass);
        oThread.start();  //starts the thread by telling the JVM to invoke that class' run()
         * 
         */
    }
    
}
