/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms._01_ArraysAndStrings;

/**
 *
 * @author ruobo
 */
public class RemoveDuplicate {
    /**
    * m2w: 1. dobule for loop , check each and its later entries.
    * time: O(n^2)  Space: O(1)
    * @param str
    *@return
    */
    public char[] removeDuplicates(char[] str){
        if(str == null) return null;
        if(str.length < 2) return null;
        outer:
        for(int i = 0; i < str.length; i ++){
            inner:
            for(int j = i + 1; j < str.length; j++){
                if(str[i] == str[j]){
                    for(int k = j; k < str.length -1; k++){ /*deleting(move everything forward.)*/
                        str[k] = str[k+1];
                    }
                }
            }
        }
        return str;
    }
    
    /**
    * m2w: 2. fixed size additional memory, assuming ASCII again, with boolean[] of size 256.
    * @param str
    * @return
    */
    public char[] removeDuplicates2(char[] str){
        if(str == null) return null;
        if(str.length < 2) return null;
        boolean[] hasDup = new boolean[256]; //default value all false
        for(int i = 0; i < str.length; i++){
            int c = str[i];
            if(hasDup[c]){
                //remove(move everything left.)
                for(int j = i; j < str.length-1; j++){
                    str[j] = str[j+1];
                }
            }else{
                hasDup[c] = true;
            }
        }
        return str;
    }
    
    /**
    * m2w: 3. with fixed size additional memory as 2. move while parsing(skip duplicated entries.), so with out the extra O(n) moving or parsing.
    * time: O(n) , space: O(1).
    * @param str
    * @return
    */
    public char[] removeDuplicates3(char[] str){
        if(str == null) return null;
        if(str.length < 2) return str;
        boolean[] hasDup = new boolean[256];
        hasDup[str[0]] = true;
        int tail = 1;
        //starting from 1
        for(int i = 1; i < str.length; i++){
            if(!hasDup[str[i]]){//if hasn't appeared yet
                str[tail] = str[i]; //assign current index to tail index
                tail++; // only increase when it hasn't appeared, i.e. will skip the duplicated ones, thus removed.
                hasDup[str[i]] = true;
            }
        }
        return str;
    }
    
    
}
