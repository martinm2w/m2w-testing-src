/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._00_Other;

/**
 *
 * @author ruobo
 */
public class TestingCharNInt {
    
    public static void main(String[] args){
        
        char a = 50;
        char b = '3';
        char B = 'a';
        String c = "4";
        int i = a;
        int j = b;
        int k = B;
        int l = 2; 
//        char C = l;//possible loss of precision.
        System.out.println(a);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println("--------------------------");
        
        char ac = 50;
        int ai = ac;
        System.out.println("ac: " + ac);
        System.out.println("ai: " + ai);
    }
}
