/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.StringIOFormatingParsing.String;

/**
 *
 * @author ruobo
 * @date Jun 13, 2011
 */
public class TestingStringConcatenationOperator {
//	====================================Attributes=============================================

//      ===================================init & const============================================

//	====================================main method============================================
    public static void main(String[] args){
        String a = "String"; int b = 3; int c = 7;
        System.out.println("a + b + c: " + a + b + c); // either operand is a String ,the + operator becomes a String concatenation.
        System.out.println("a + (b+c): " + a + (b+c)); // if both operands are numbers, the + operator is the addition operator.
    }
//	===================================util methods============================================

//      =================================setters & getters=========================================
}
