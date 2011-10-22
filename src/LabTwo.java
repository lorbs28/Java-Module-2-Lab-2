
import java.util.*;
import java.util.logging.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lorbs28
 */
public class LabTwo extends Thread {
    
    private Logger myLogger;  //instance variable for logging    
    private List alphabetList;
    private String stringName;  //unique identifier for this thread
    private boolean stopper;
    
    
    public LabTwo() {
        myLogger = Logger.getLogger("labTwoLogger");  //get a reference to the logger for our application        
    }
    
    public LabTwo(String strIn) {
        this();
        
        this.alphabetList = new ArrayList();
        this.stringName = strIn;
    }
    
    public void run() {
        runLabOneThings();
        myLogger.log(Level.INFO, "Killing the thread.");
    }
    
    public void runLabOneThings() {
        try {
            char letter;
            
            for (letter = 'a'; letter <= 'z'; letter++) {
                
                System.out.println("Alphabet is at letter: " + letter);
                
                this.addToAlphabetList(letter);
                
                if (letter == 'z') {
                    myLogger.log(Level.INFO, "Reached end of the alphabet, preparing to terminate.");
                    break;
                }
                
                
            
                Thread.sleep(500);
            }
            
        } catch(Exception e) {
            myLogger.log(Level.SEVERE, "Encountered an exception: " + e.getMessage());
            System.out.println("Encountered an exception at " + new java.util.Date());
            e.printStackTrace();
        }
    }
    
    public String getThreadName()
    {
        return this.stringName;
    }

    public void allStop()
    {
        myLogger.log(Level.WARNING, "Attempting to stop the thread");
        this.stopper = true;
    }
    
    public synchronized void addToAlphabetList(char letter) {
        this.alphabetList.add(letter);
    }
    
    public synchronized void removeFromAlphabetList(char letter) {
        this.alphabetList.remove(letter);
    }
    
    public String toString()
    {
        StringBuffer strbHold;
        
        strbHold = new StringBuffer();
        strbHold.append("Thread: " + this.stringName);
        strbHold.append(System.getProperty("line.separator"));
        return strbHold.toString ();
    }
    
    
}
