/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._05_FlowCtrl_Exp_Assertion.FlowControl;

import java.util.ArrayList;

/**
 * 1.iteration part of the basic for loop runs after each loop body, that's why for(int i = 0; ++i < 4;) prints 123 and for(int i = 0; i < 4; ++i) prints 0123
 * @author ruobo
 * @date Jun 16, 2011
 */
public class ForLoop {
//	====================================Attributes=============================================

//      ===================================init & const============================================

//	====================================main method============================================
    public static void main(String[] args){
        System.out.println("1.testing enhanced for loop: for-each:");
        ArrayList<String> A = new ArrayList<String>();
        for(int i = 0; i < 5; i++)
            A.add(String.valueOf(i));
            ;
        for(String b : A)
            System.out.println(b);System.out.println("huh?");
            ;
            ;
            System.out.println("not over?");
        System.out.println("over?");
        System.out.println("note : abbriviating for loop is only effective for the 1 statement after the loop.");
        System.out.println("================================================");
        
            
        System.out.println("2. testing the declaration block:");
        //3 parts:
        //declare and init
        //boolean expresstion
        //iteration expression
        
        //for(int i = 0, int j = 0; i < 5; i ++){// can't have 2 declares.
        for(int i = 0, j = 0; i < 5; i ++){// legal
        }
        char z = 0;
//        for (int z = 1; z < 3 ; z++){ // already defined
//        }
        
        for(int i = 0; true; System.out.println("iterating, i: " + i)){
            i++;
            if(i == 3)
                break;
        }
        System.out.println("==================================================");
        
        System.out.println("3. testing the decreasing for loop:");
        for(int i = 3; i > 0; i--){
            System.out.println(i);
        }
    }
        
            
//	===================================util methods============================================

//      =================================setters & getters=========================================
 }

class For1{
    public static void main(String[] args){
        For1 m2w = new For1();
        m2w.ppi();
        m2w.ppi1();
    }

    private void ppi(){
        for(int i = 0; ++i<4;)
            System.out.println(i);
    }
    private void ppi1(){
        for(int i = 0; i < 4; ++i)
            System.out.println(i);
    }
}