/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._09_Thread_Stack_Synchronize;

/**
 *
 * @author ruobo
 * @date Jul 21, 2011
 */
public class TestingInstantiationWithTheadObj {}

class MyThread extends Thread{
    public static void main(String[] args){
        MyThread t = new MyThread();
        Thread x = new Thread(t);
        x.start();
    }
    
    @Override
    public void run(){
       for(int i = 0; i<3; ++i) {
           System.out.print(i + "..");
       }
    }
}
