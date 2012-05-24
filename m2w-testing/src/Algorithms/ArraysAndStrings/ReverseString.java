/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.ArraysAndStrings;

/**
 *
 * @author ruobo
 */
public class ReverseString {
    
    public static void main(String[] args){
        ReverseString rs = new ReverseString();
        String input = "a;ldkfja;lkdjfhxvbiuyahsdfkjhnadf";
        rs.removeDup1(input);
        rs.removeDup2(input);
        rs.removeDup3(input);
    }
    
    public void removeDup1(String input){
        System.out.println("O(n^2) method: " + input);
	outer:
	for(int i = 0; i < input.length(); i ++){
		char tmp1 = input.charAt(i);
		inner:
		for(int j = i+1; j < input.length(); j++){// j = i+1
			char tmp2 =input.charAt(j);
//                        System.out.println("tmp1: " + tmp1 + " tmp2: " + tmp2);
			if(tmp1 == tmp2){
//                                input.charAt(i) = 'f';
				continue outer; 	//continue 在前outer在后
                                
			}
		}
		System.out.print(tmp1);
                
	}
        System.out.println();

    }
    
    public void removeDup2(String input){
	boolean[] appearedChars = new boolean[256];
        System.out.println("O(n) method1: " + input);
	for(int i = 0; i < input.length(); i ++){
		int pos = input.charAt(i);
		if(appearedChars[pos])
			continue;
		appearedChars[pos] = true;
		System.out.print(input.charAt(i));
	}
        System.out.println();
    }   
    
    public void removeDup3(String input){
	long checker  = 0;
        System.out.println("O(n) method2: " + input);
	for(int i = 0; i < input.length(); i ++){
		char tmp = input.charAt(i);
		if((checker & (1 << tmp - 'a')) > 0 ){
			continue;
		}
		checker |=( 1 <<  tmp - 'a' );	
		System.out.print(tmp);
	}
        System.out.println();
    }
    
    
}
