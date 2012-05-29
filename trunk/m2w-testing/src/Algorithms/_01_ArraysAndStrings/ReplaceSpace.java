/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms._01_ArraysAndStrings;

/**
 *
 * @author ruobo
 */
public class ReplaceSpace {
    
    /**
    * m2w: 1. count number of spaces during the first scan of the String. parse the string again and store to new array.
    * time: O(n) Space: O(n)
    * @param str
    * @return
    */
    public char[] replaceString1(char[] str){
        if(str == null) return null;
        int spaceCount = 0;
        int newLength = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i] == ' ') spaceCount++;
        }
        newLength = str.length + 2*spaceCount;
        int newSpaceCount = 0;
        char[] newStr = new char[newLength];
        for(int i = 0; i < newLength; i++){
            int indexI = i - newSpaceCount*2;
            if(str[indexI] == ' '){
                newStr[i] = '%';
                newStr[++i] = '2';
                newStr[++i] = '0';
//                i += 3;
                newSpaceCount++;
            }else{
                newStr[i] = str[indexI];
                
            }
        }
        return newStr;
    }
    
    
    
    
    

    
    /**
     * m2w: same as 1. different in var usage.
     * @param input
     * @return 
     */
    public char[] replaceString2(char[] input){
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
    

        public static void main(String [] args){
        ReplaceSpace rs = new ReplaceSpace();
        char[] a = {'a', ' ', 'b'};
//        char[] b = rs.replaceCharsInString(a);
//        ReplaceSpace.ReplaceFun(a, a.length);
        char[] b = rs.replaceString1(a);
        for(int i = 0; i < b.length; i ++){
            System.out.print(b[i]);
        }            
        System.out.println();
        
    }
    
}
