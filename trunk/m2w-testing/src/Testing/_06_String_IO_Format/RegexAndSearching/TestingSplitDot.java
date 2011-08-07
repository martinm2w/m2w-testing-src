/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._06_String_IO_Format.RegexAndSearching;

/**
 *
 * @author ruobo
 * @date Aug 6, 2011
 */
public class TestingSplitDot {
    public static void main(String[] args){
       String a = new String("dogs. with words.");
       String[] output = a.split("\\.");
       for(String b : output)
           System.out.println(b);
    }
}
