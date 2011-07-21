/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.Thread_Stack_Synchronize;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruobo
 * @date Jul 20, 2011
 */
public class TestingNotify{

    String s = "s";
    public static void main(String[] args){
        TestingNotify m2w = new TestingNotify();
        Thread B = new Thread(new Runnable(){
            @Override
            public synchronized void run(){
//                for(int j = 0; j++ < 50;) {System.out.println("B - " + j );}
//                try {Thread.sleep(5000);} catch (InterruptedException ex) {}
//                TestingNotify.class.notify();
//                for(int j = 50; j++ < 100;){System.out.println("B - " + j );}
                for(int i = 0; i++ < 50;){System.out.println("B: " + i);}
                try{this.wait();}catch(Exception e){}
                for(int i = 50; i++ < 100;){System.out.println("B: " + i);}
            }
        });
        B.start();
        m2w.test1(B);
      }

    private synchronized void test1(Thread B){
        for(int j = 0; j++ < 50;) {System.out.println("main " + j );}
//        try {Thread.sleep(2000);} catch (InterruptedException ex) {}
        B.notify();
        for(int j = 50; j++ < 100;){System.out.println("main " + j );}
//        TestingNotify m2w = new TestingNotify();
//        TestingNotify.B b = m2w.new B();
//        b.start();
//        synchronized(m2w){
//        for(int i = 0; i++ < 50;){System.out.println("main: " + i);}
//        try{wait();}catch(Exception e){}
//        for(int i = 50; i++ < 100;){System.out.println("main: " + i);}
    }
//    int i = 0;
//    int j = 0;
//    class A extends Thread{
//        @Override
//        public void run(){
//            System.out.println("in A");
//            synchronized(TestingNotify.this){
//                for(int i = 0; i++ < 100;){
//                    System.out.println("A - " + i );
//                    try{if(i == 30) this.wait();}catch(Exception e){}
//                }
//            }
//        }
//    }
}
//    class B extends Thread{
////        A a1;
//        @Override
//        public void run(){
//            go();
//        }
////            synchronized(TestingNotify.this){
////                for(int j = 0; j++ < 50;) {System.out.println("B - " + j );}
//////                try {Thread.sleep(2000);} catch (InterruptedException ex) {}
////                notify();
////                for(int j = 50; j++ < 100;){System.out.println("B - " + j );}
////            }
//
//         void go(){
//            for(int j = 0; j++ < 50;) {System.out.println("B - " + j );}
//            notify();
//            for(int j = 50; j++ < 100;){System.out.println("B - " + j );}
//        }
//    }

//    public static void main(String[] args){
////        TestingNotify.A a = new  TestingNotify().new A();
//        TestingNotify.B b = new  TestingNotify().new B();
////        b.a1 = a;
////        a.start();
//        b.start();
//    }

