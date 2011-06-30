/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.String;

/**
 *
 * @author ruobo
 * @date Jun 26, 2011
 */
public class SubString {
    public static void main(String[] agrs){
        String a = new String("abcdefghijk");
        String b = a.substring(2);
        int c = a.indexOf("e");
        String d = a.substring(c);
        String e = a.substring(3,6);

        System.out.println("a: " + a);
        System.out.println("a: " + "012345678901");
        System.out.println("b: " + b + " -sub 2");
        System.out.println("c: " + c + " -index of e");
        System.out.println("d: " + d + " -sub c");
        System.out.println("e: " + e + " -sub 3,6");

    }
}
