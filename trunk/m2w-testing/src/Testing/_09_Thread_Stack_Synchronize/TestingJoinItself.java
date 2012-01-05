/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._09_Thread_Stack_Synchronize;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruobo
 * @date Aug 7, 2011
 */
public class TestingJoinItself extends Thread{
    public void run(){
        TestingJoinItself m2w = new TestingJoinItself();
        m2w.start();
        try {
            m2w.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestingJoinItself.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args){
        
    }

}
