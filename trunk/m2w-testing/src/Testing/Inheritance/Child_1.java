/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.Inheritance;

/**
 *
 * @author ruobo
 */
public class Child_1 extends SuperClass{

    @Override
    public void print(){
        System.out.println("i'm from child 1's overide");
    }

    public void printC1(){
        System.out.println("i'm from child 1's own method");
    }

}
