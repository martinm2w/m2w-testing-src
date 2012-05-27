/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms._01_ArraysAndStrings;

/**
 *
 * @author ruobo
 */
public class CheckRotationString {
    public static void main(String [] args){
        CheckRotationString crs = new CheckRotationString();
        System.out.println(crs.isRotation1("waterbottle", "erbottlewat"));
        System.out.println(crs.isRotation2("waterbottle", "erbottlewat"));
    }
    
    
    public boolean isRotation1(String s1, String s2){
	String right = s2.substring(s2.length()/2, s2.length());
	String left = s2.substring(0, s2.length()/2);
        System.out.println(left);
        System.out.println(right);
	if(s1.contains(left)){
		StringBuffer s 	= new StringBuffer(right+left);
		while(!s.toString().equals(s1)){
                        s.append(s.charAt(0));
                        s.deleteCharAt(0);
		}
                return s.toString().equals(s1);
	}else{
		StringBuffer s 	= new StringBuffer(left+right);
		while(!s.toString().equals(s1)){
                        s.insert(0, s.charAt(s.length())-1);
                        s.deleteCharAt(s.length()-1);
		}
                return s.toString().equals(s1);
	}
    }
    
    public boolean isRotation2(String s1, String s2){
	if (s1.length() == s2.length()  && s1.length() > 0){
		String tmp = s1+s1;
		if(tmp.contains(s2)){
                    return true;
                }
	}
        return false;
    }
}
