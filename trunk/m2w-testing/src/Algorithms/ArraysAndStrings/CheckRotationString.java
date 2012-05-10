/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.ArraysAndStrings;

/**
 *
 * @author ruobo
 */
public class CheckRotationString {
    public static void main(String [] args){
        CheckRotationString crs = new CheckRotationString();
        System.out.println(crs.reverseRotation("waterbottle", "erbottlewat"));
        System.out.println(crs.isRotation("waterbottle", "erbottlewat"));
    }
    
    
    public String reverseRotation(String s1, String s2){
	String right = s2.substring(s2.length()/2, s2.length());
	String left = s2.substring(0, s2.length()/2);
//	String return = "";
        System.out.println(left);
        System.out.println(right);
	if(s1.contains(left)){
                
		StringBuffer s 	= new StringBuffer(right+left);
		while(!s.toString().equals(s1)){
//			s = s.subString(1, s.length() - 1)  + s.subString(0,0);
                        s.append(s.charAt(0));
                        s.deleteCharAt(0);
		}
                return s.toString();
	}else{
		StringBuffer s 	= new StringBuffer(left+right);
		while(!s.toString().equals(s1)){
//			s = s.subString(s.length() -1, s.length() -1) + s.subString(0, s.length()-2);
                        s.insert(0, s.charAt(s.length())-1);
                        s.deleteCharAt(s.length()-1);
		}
                return s.toString();
	}
//	return s.toString;
    }
    
    public boolean isRotation(String s1, String s2){
//	if (s1.length() != s2.length()) return false;
	if (s1.length() == s2.length()  && s1.length() > 0){
		String tmp = s1+s1;
		if(tmp.contains(s2)){
                    return true;
                }
	}
        return false;
    }
}
