/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.ArraysAndStrings;

/**
 *
 * @author ruobo
 */
public class DecideAnagrams {
    
    public static void main(String[] args){
        DecideAnagrams da = new DecideAnagrams();
        System.out.println(da.decideAnagram("abc", "cba"));
        System.out.println(da.decideAnagram("abc", "slkj"));
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
}
