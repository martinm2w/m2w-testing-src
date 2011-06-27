/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.StringIOFormatingParsing;

import java.lang.reflect.Array;

/**
 *
 * @author ruobo
 * @date Jun 27, 2011
 */
public class ToStringInString {
//	====================================Attributes=============================================

//      ===================================init & const============================================

//	====================================main method============================================
    public static void main(String[] args){
        String a = "big surprise";
        String[] b = new String[3];
        System.out.println("sop b: " + b);
        System.out.println("sop a: " + a);
        System.out.print("overrided toString() in String: ");
        System.out.println(a.toString());
    }
//	===================================util methods============================================

//      =================================setters & getters=========================================
}
