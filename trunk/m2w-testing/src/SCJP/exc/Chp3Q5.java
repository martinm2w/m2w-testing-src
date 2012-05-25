/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SCJP.exc;

/**
 *
 * @author ruobo
 */
public class Chp3Q5 {

    int x = 5;

    public static void main(String[] args){
        final Chp3Q5 a = new Chp3Q5();
        a.x = 6;
        System.out.println("a.x: "+ a.x + ". The \"final\" modifier assures that a reference variable cannot be referred to a different object, but it dosent keep the object's state from being changed");
        
    }
}
