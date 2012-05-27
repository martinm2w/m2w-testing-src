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
public class DecideAnagrams {
    
    public static void main(String[] args){
        DecideAnagrams da = new DecideAnagrams();
//        System.out.println(da.decideAnagram("abc", "cba"));
//        System.out.println(da.decideAnagram("abc", "slkj"));
        System.out.println(da.isAnagram2("abc", "cba"));
//        char a = ' ';
    }
    
    
    
    public boolean decideAnagram(String str1, String str2){
            if(str1 != null && str2 != null && str1.length() == str2.length()){
		for(int i = 0; i < str1.length(); i ++){
			if(str1.charAt(i) == str2.charAt(str1.length() - i - 1)){
				continue;
			}else{
				return false;
			}
		}
		return true;
	}else{
            return false;
        }
    }
    
    /**
    * m2w: 1. sort the strings
    * time: O(nlogn), space: O(n)
    * @param s1
    * @param s2
    * @return
    */
    public boolean isAnagram1(String s1, String s2){
        
        return sort(s1).equals(sort(s2));
    }

    /**
    * m2w: sorting
    * @param str
    * @return
    */
    public String sort(String str){
        char[] ca = str.toCharArray();
        ArrayList<Character> list = new ArrayList<Character>();
        for(char c : ca) list.add(c);
        Collections.sort(list);
        StringBuilder s = new StringBuilder();
        for(Character c : list){
            s.append(c);
        }
        System.out.println(s);
        return s.toString();
    }
    
    /**
    * m2w: 2. check if the two Strings have identical counts for each unique char. assuming ASCII again. loop s1, save counts to int[] letters size 256 array, then loop s2, minus each char entry in int[], if another is found and letters[i]  == 0, then has more of that char than s1
    * time: O(2n), space: O(1); tested.
    * @param s1
    * @param s2
    * @return
    */
    public boolean isAnagram2(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int[] letters = new int[256];
        int num_unique_chars = 0;
        int num_completed_s2 = 0;
        char[] s1_array = s1.toCharArray();
        //prepare int array for comparing with s2.
        for(char c : s1_array){ // count number of each char in s.
            if(letters[c] == 0) ++num_unique_chars;
            letters[c]++;
        }
        //checking s2.
        for(int i = 0; i < s2.length(); i++){
            int c = s2.charAt(i);
            if(letters[c] == 0){ // found more of char c in s2 than in s1.
                 return false;
            }
            letters[c]--; // if letters[c] is not 0, then decrease it. prepare for next appearance of c.
            if(letters[c] == 0){ // if decreasing by 1 after found c made letter[c] become 0
                num_completed_s2++; // we say it's an completed char
                if(num_completed_s2 == num_unique_chars){ // check each time if completed == unique chars
                    //it's a match if t has been processed completely (i is the last index)
                    return i == s2.length() - 1;
                }
            }
        }
        return false;
    }
    
}
