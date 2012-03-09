/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.ArraysAndStrings;

/**
 *
 * @author m2w
 */
public class TestingCharToInt {
    public static void main(String[] args){
        int i = 0;
        i = '1' - '0';
        System.out.println(i);
        for(; i <5 ; i++){
            System.out.println();
        }
        i = i / 10;
    }
}
