/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms._01_ArraysAndStrings;

import java.util.*;
/**
 *
 * @author ruobo
 */
public class CheckIfUniqueChars {
    /** m2w: 
    *   1.basic version, uses hashset structure.
    */
    /**
     * 
     * @param str
     * @return 
     */
    public boolean isUniqueChars(String str){
        HashSet<Character> chars = new HashSet<Character>();
        for(int i = 0; i < str.length(); i++){
            Character c = str.charAt(i);
            if(chars.contains(c)) return false;
            chars.add(str.charAt(i));
        }
            return true;
    }
    
    /**
    *
    * m2w: 2. uses a fixed sized boolean array. assuming char set is ASCII, there are only 256 different chars.
    * @param str
    * @return
    */
    public boolean isUniqueChars2(String str){
        boolean[] chars = new boolean[256];
        for(int i = 0; i < str.length(); i++){
            int index = str.charAt(i);
            if(chars[index]) return false;
            chars[index] = true;
        }
        return true;
    }

    /**
    * m2w: 3. uses a int local variable. using bit manipulation, pushing bits to the left. assuming there are only a-Z chars
    * @param str
    * @return
    */
    public boolean isUniqueChars3(String str){
        int check = 0;
        for(int i = 0; i < str.length(); i++){
            int c = str.charAt(i) - 'a';
            if((check & (1 << c)) > 0) return false;
            check |= 1 << c;
        }
        return true;
    }
    
    
    
}
