/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SCJP.exc;

/**
 *
 * @author ruobo
 */
public class Exercise9_1 extends Thread{

    public static void main(String[] args){
        Exercise9_1 m2w = new Exercise9_1();
        m2w.start();
    }

    @Override
    public void run(){
        for(int i = 0; i++ < 100; ){
            if((i % 10) == 0){
                System.out.println(i);
            }
            try{
                Thread.sleep(1000);
            }catch(Exception e){e.printStackTrace();}
        }
    }
}

class EX9_1_1 implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i++ < 100;){
           if((i % 10) == 0){
                System.out.println(i);
            }
            try{
                Thread.sleep(100);
            }catch(Exception e){e.printStackTrace();}
        }
    }
    public static void main(String[] args){
        EX9_1_1 run = new EX9_1_1();
        Thread m2w1 = new Thread(run);
        m2w1.start();
        for(Object O : m2w1.getStackTrace())
            System.out.println(O);
    }
}
