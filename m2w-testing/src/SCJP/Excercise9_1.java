/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SCJP;

/**
 *
 * @author ruobo
 */
public class Excercise9_1 extends Thread{
    
    @Override
    public void run(){
        for(int i = 0; i++ < 100; ){
            if((i % 10) == 0){
                System.out.println(i);
            }
        }
    }
}
