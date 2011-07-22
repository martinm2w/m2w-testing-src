/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._09_Thread_Stack_Synchronize;

/**
 * 1. as soon as one thread starts with x.start(); the thread in main continues.
 * 2. able to synchronized() on args in main(), cuz args is a array Obj.
 * 3. the syn() is for declaring which Obj's lock this block is going to get. inorder to wait or notify.
 * @author ruobo
 * @date Jul 21, 2011
 */
public class TestingWaitAndNotify {
    
}

class ThreadA{
    public static void main(String[] args){
        ThreadB b = new ThreadB();
        b.start();
//        synchronized(args){}
        synchronized(b){
            try{
                System.out.println("Waiting for b to complete...");
                b.wait();
            }catch(Exception e){}
            System.out.println("Total is: " + b.total);
        }//ends syn
    }//closes main
}//closes class threadA

class ThreadB extends Thread{
    int total;
    
    @Override
    public void run(){
        synchronized(this){//
            for(int i = 0; i<100; i++){
                total += i;
            }
            notify();
        }
    }
}