/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.Operators;

/**
 *
 * @author ruobo
 * @date Jun 13, 2011
 */
public class TestingCompoundAdditiveOperator {
//	====================================Attributes=============================================

//      ===================================init & const============================================

//	====================================main method============================================
    public static void main(String[] args){
        String a = "123";
        a += "4";
        a += "5";a += "6";
        System.out.println("a is now: " + a);
//        a -= "6";// "-=" can't apply to Strings.
        int b = 3;
        b -= 1;
        System.out.println("b is now: " + b);
        
     
    }
//	===================================util methods============================================

//      =================================setters & getters=========================================
}
