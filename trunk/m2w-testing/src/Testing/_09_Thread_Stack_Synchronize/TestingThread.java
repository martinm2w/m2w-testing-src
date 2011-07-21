/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._09_Thread_Stack_Synchronize;

import static Testing.util.SOP.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * 1. join() throws interrupted Exception. as well as sleep().
 * 2. join() is supposed to be in A thread's run(), to join B thread(B.join()), or , use in main(), to ask main to join some thread.
 * 3. the inner class cannot access local vars unless it's final.
 * 4. the join() must comes before the working code to make the working code wait till the waiting thread is done.
 * @author ruobo
 * @date Jul 20, 2011
 */
public class TestingThread {
    public static void main(String[] args){

        final int yes = 0;
        final Thread A = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 0; i++ < 10;){
                    try {
                        System.out.println("A" + i);
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {}
                }
            }
        });

        Thread B = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 0; i++ < 10;){
                    try {
                        System.out.println("B" + i);
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {}
                }
            }
        });

        Thread C = new Thread(new Runnable(){
            @Override
            public void run(){
                try{A.join();}catch(Exception e){}// has to be in the front the code to make the join work
                for(int i = 0; i++ < 10;){
                    try {
                        System.out.println("C" + i);
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {}
                }
//                try{A.join();}catch(Exception e){}
                System.out.println(yes);
            }
        });

        A.setPriority(Thread.MAX_PRIORITY);
        B.setPriority(Thread.MIN_PRIORITY);

        sop(A.getState());
        sop(B.getState());
        sop(C.getState());

        A.start();
        B.start();
        C.start();
        

        sop(A.getState());
        sop(B.getState());
        sop(C.getState());
//        for(int i = 0; i++ < 10;){
//            System.out.println("main");
//            try{Thread.sleep(10);}catch(Exception e){}
//        }

        try {
            A.join(); // so that main comes in the last
        } catch (InterruptedException ex) {ex.printStackTrace();}

        for(int i = 0; i++ < 20;){
            System.out.println("main");
        }
    }
}
