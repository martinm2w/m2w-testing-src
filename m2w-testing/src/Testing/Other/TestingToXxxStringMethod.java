/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.Other;

/**
 *
 * @author ruobo
 * @date Jun 8, 2011
 */
public class TestingToXxxStringMethod {
//	====================================Attributes=============================================

//      ===================================init & const============================================
        
//	====================================main method============================================
        public static void main(String[] args){
            long a = 254;
            Long A = new Long("254");
            Long L = 123l; //assignemnt using primitives
            Integer I = 123;
            Long A1 = Long.valueOf("254", 16);
            Long A2 = Long.valueOf("254", 10);
            Long A3 = Long.valueOf("254", 8);
            int b = A.intValue();
            int b1 = A1.intValue();
            int b2 = A2.intValue();
            int b3 = A3.intValue();
            
            //this is the only way to output a octal representation of the number
            String B = Long.toOctalString(A);
            
            System.out.println(b);
            System.out.println(B);
            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);
            System.out.println(A2.intValue());
        }
//	===================================util methods============================================

//      =================================setters & getters=========================================
}
