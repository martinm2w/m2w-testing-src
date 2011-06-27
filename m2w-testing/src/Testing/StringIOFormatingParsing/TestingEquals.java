/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.StringIOFormatingParsing;

import java.util.ArrayList;

/**
 *
 * @author ruobo
 * @date Jun 8, 2011
 */
public class TestingEquals {
//	====================================Attributes=============================================

//      ===================================init & const============================================

//	====================================main method============================================
    public static void main(String[] args){
        ArrayList A = new ArrayList<String>();
        ArrayList B = new ArrayList<String>();
        ArrayList C = A;
        
        A.add("a");
        B.add("a");
        
        boolean x = A == B ;
        boolean y = A.equals(B);
        boolean z = C == A ;
        
        System.out.println("x is: " + x + ", not the same object");// java pass by value, A and B holds different reperesentation of the different objects
        System.out.println("y is: " + y + ", meaningfully equivelance");
        System.out.println("z is: " + z + ", same object");
        
    }
//	===================================util methods============================================

//      =================================setters & getters=========================================
}
