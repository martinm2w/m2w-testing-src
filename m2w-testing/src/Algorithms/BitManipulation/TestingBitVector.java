/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.BitManipulation;

/**
 *
 * @author m2w
 */
public class TestingBitVector {
    public static void main(String[] args){
        int a = 'a' - 'a';
        int A = 'Z';
        System.out.println(a);
        System.out.println(A);
//        0 |= (1 << 3);
        System.out.println(TestingBitVector.isUniqueChars("abcdefa"));
        int c = 0;
        int d = 1<<11;
        System.out.println(Integer.toBinaryString(c) + "\t|");
        System.out.println(Integer.toBinaryString(d) + "\t=");
        System.out.println("---------");
        System.out.println(Integer.toBinaryString(c |= d));
        System.out.println( "c: " + Integer.toBinaryString(c) );
        System.out.println(c);
        long q = 0l;
        System.out.println(Long.toBinaryString(~0l).length());
    }
    
    
    public static boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); ++i) {
         int val = str.charAt(i) - 'a';
         if ((checker & (1 << val)) > 0) return false;
         checker |= (1 << val);
         }
         return true;
 }  
}
