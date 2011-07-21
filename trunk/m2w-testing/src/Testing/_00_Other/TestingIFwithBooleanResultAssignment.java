/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._00_Other;

/**
 *
 * @author ruobo
 * @date Jun 13, 2011
 */
public class TestingIFwithBooleanResultAssignment {
//	====================================Attributes=============================================

//      ===================================init & const============================================

//	====================================main method============================================
    public static void main(String[] args){
        boolean x = false;
        if(x = true){ // compiles , with if(true)
            System.out.println(x);// x is true
        }
        
//        if(boolean y = false){ //compile failure , required value , found class, it's actually in the 
//            
//        }
    }
//	===================================util methods============================================

//      =================================setters & getters=========================================
}
