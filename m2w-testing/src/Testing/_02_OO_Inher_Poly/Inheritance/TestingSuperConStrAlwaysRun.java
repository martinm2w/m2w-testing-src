/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._02_OO_Inher_Poly.Inheritance;

/**
 * 1. super class's constructor will always run because there is a obmited super(); in subclasses' constructor.
 * 2. super() will run even if the subclasses' constructor is overloaded.
 * @author ruobo
 * @date Jul 21, 2011
 */
public class TestingSuperConStrAlwaysRun {
    public static void main(String[] args){
        B_TestingSuperConStrAlwaysRun B = new B_TestingSuperConStrAlwaysRun();
        B = new B_TestingSuperConStrAlwaysRun("B_");
    }
    
}

class A_TestingSuperConStrAlwaysRun {
    protected A_TestingSuperConStrAlwaysRun(){
        System.out.println("A");
    }
}
class B_TestingSuperConStrAlwaysRun extends A_TestingSuperConStrAlwaysRun{
    B_TestingSuperConStrAlwaysRun(){
        System.out.println("B");
    }
    B_TestingSuperConStrAlwaysRun(String s){
        System.out.println(s);
    }
}