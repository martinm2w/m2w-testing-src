/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.StringIOFormatingParsing;

/**
 *
 * @author ruobo
 * @date Jun 26, 2011
 */
public class ReplaceMethod {

    public static void main(String[] args){
        String a = "abcdef-abcdef";
        String b = a.replace("a", "x");//  all oldchar to new char
        String c = a.replace("bc", "yz");// char sequence replace ment
        String d = a.replaceAll("de", "12");// replace all

        System.out.println("a: " + a);
        System.out.println("b: " + b + " (all a to x)");
        System.out.println("c: " + c + " (all bc to yz)");
        System.out.println("d: " + d + " (all de to 12)");
        
    }
}
