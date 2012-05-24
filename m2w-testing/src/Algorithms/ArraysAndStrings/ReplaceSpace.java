/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.ArraysAndStrings;

/**
 *
 * @author ruobo
 */
public class ReplaceSpace {
    public static void main(String [] args){
        ReplaceSpace rs = new ReplaceSpace();
        char[] a = {'a', ' ', 'b'};
//        char[] b = rs.replaceCharsInString(a);
        ReplaceSpace.ReplaceFun(a, a.length);
        for(int i = 0; i < a.length; i ++){
            System.out.print(a[i]);
        }            
        System.out.println();
        
    }
    
    /**
     * mine
     * @param input
     * @return 
     */
    public char[] replaceCharsInString(char[] input){
	if(input == null) return null;
	int spaceCount = 0;
        for(int i = 0; i < input.length; i++){
                        if(input[i] == ' '){
                        spaceCount++;
                }
        }
        char[] replaced = new char[input.length + spaceCount * 2];
        int j = 0;
        for(int i = 0; i < input.length; i++){
                char tempChar = input[i];
                if(tempChar == ' '){
                    replaced[i+j] = '%';
                    replaced[i+j+1] = '2';
                    replaced[i+j+2] = '0';
                    j += 2;			
                }else{
                    replaced[i+j] = tempChar;		
                }
        }
        return replaced;
        }
    
    public static void ReplaceFun(char[] str, int length) {
        int spaceCount = 0, newLength, i = 0;
        for (i = 0; i < length; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        newLength = length + spaceCount * 2;
        str[newLength] = '\0';
        for (i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
            str[newLength - 1] = str[i];
            newLength = newLength - 1;
            }
        }
    }
    
    
    
    
}
