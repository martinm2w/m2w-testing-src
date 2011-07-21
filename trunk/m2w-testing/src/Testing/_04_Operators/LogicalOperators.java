/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._04_Operators;

/**
 *
 * @author ruobo
 * @date Jun 14, 2011
 */
public class LogicalOperators {
//	====================================Attributes=============================================

//      ===================================init & const============================================

//	====================================main method============================================
    public static void main(String[] args){
        System.out.println("xor " + ((2<3) ^ (4>3)));
        System.out.println("\"true\" xor \"false\": " + (true ^ false));
        System.out.println("\"true\" xor \"true\": "  + (true ^ true));
        boolean x,y = false;
        if(false & true){
            System.out.println("&");
        }
        if(true && false){
            System.out.println("&&");
        }
        
        if(false | true){
            System.out.println("|");
        }
        if(false || true){
            System.out.println("||");
        }
        //need to be exactly 1 true on both operands
    }
//	===================================util methods============================================

//      =================================setters & getters=========================================
}
