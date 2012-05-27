/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms._01_ArraysAndStrings;

import java.lang.StringBuilder;
/**
 *
 * @author ruobo
 */
public class ReverseC_String {
    /**
    * m2w: 1st solution, not in-place
    * @param s
    * @return
    */
    public String reverseCString(String s){
        StringBuilder sb = new StringBuilder();
        String a = "\\0";
        sb.append(a);
        for(int i = s.length()-1; i >= 0; i--){
            char c = s.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }
    
    /**
    * m2w: 2. in-place, these is no meaning of this if the input is a String , cuz we would build and cast a lot of String objects in the heap, waiting for garbage collection. we should assume the input is a char[]. this was an c++ problem.
    * time: O(n), space: O(1)
    * @param chars
    * @return
    */
    public char[] reverseCString(char[] chars){
    for(int i =chars.length-1; i >=chars.length / 2; i--){
            int front = chars.length-1-i;
            char temp = chars[front];
            chars[front] = chars[i];
            chars[i] = temp;
        }
        return chars;
    }
}
