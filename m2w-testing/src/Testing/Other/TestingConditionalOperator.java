/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.Other;

/**
 *
 * @author ruobo
 * @date Jun 13, 2011
 */
public class TestingConditionalOperator {
//	====================================Attributes=============================================

//      ===================================init & const============================================
    public static void main(String[] agrs){
        // ? 
        int numOfPets = 3;
        String status = (numOfPets < 4) ? "Pet limit not exceeded" : "Too many pets";
        System.out.println("This pet status is: " + status);
    }
           
//	====================================main method============================================

//	===================================util methods============================================

//      =================================setters & getters=========================================
}
