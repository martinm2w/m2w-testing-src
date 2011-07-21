/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._06_String_IO_Format.String;

/**
 *
 * @author ruobo
 * @date Jun 27, 2011
 */
public class TwoIndexArgumentsMethods {

    public static void main(String[] args){
        String a = "012345678";
//        String b = a.substring(beginIndex, endIndex);
        String b = a.substring(2, 4);//should be 2 and 3
        System.out.println("b is: " + b + "  -sub 2,4 out of 012345678");
//        StringBuilder a1 = "012345678";// incompatible types
        StringBuilder a1 = new StringBuilder(a);
//        a1.delete(start, end);
        a1.delete(2, 4);
        System.out.println("a1 is: " + a1 + "  -delete 2,4 out of 012345678");
    }
}
