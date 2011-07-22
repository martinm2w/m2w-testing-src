/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._09_Thread_Stack_Synchronize;


/**
 *
 * @author ruobo
 * @date Jul 20, 2011
 */
public class TestingNotifyFail{
}
//    String s = "s";
//    Integer k = 0;
//    public static void main(String[] args){
//        TestingNotifyFail m2w = new TestingNotifyFail();
//        ThreadBB B = new ThreadBB();
////        Thread B = new Thread(new Runnable(){
////            @Override
////            public void run(){
////                synchronized(this){
////                    for(int i = 0; i++ < 10;){System.out.println("B: " + i);}
////                    System.out.println("B is Waiting...");
////                    try{wait();}catch(Exception e){}
////                    for(int i = 50; i++ < 100;){System.out.println("B: " + i);}
////                }
////            }
////        });
//        B.start();
//        synchronized(this){
//            System.out.println("is Waiting...");
//            System.out.println("in main: " + Thread.currentThread().getName());
//            try{wait();}catch(Exception e){}
//            System.out.println("K: " + m2w.k );
//        }
//      }
//}
//
////class m2w has a instance var that needs to be added and printed.
//
//class ThreadBB extends Thread{
//    
//    @Override
//    public void run(){
//        TestingNotifyFail m2w = new TestingNotifyFail();
//        this.setName("B");
//        synchronized(m2w){
//            for(int i = 0; i++ < 100;){m2w.k++;}
//            m2w.notify();
////            try{Thread.sleep(5000);}catch(Exception e){}
//            
////            for(int i = 50; i++ < 100;){System.out.println("B: " + i);}
//            System.out.println("this: " + Thread.currentThread().getName());
//        }
//    }
//}
