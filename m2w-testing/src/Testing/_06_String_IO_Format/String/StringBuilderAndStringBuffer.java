/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._06_String_IO_Format.String;

/**
 *
 * @author ruobo
 * @date Jul 2, 2011
 */
public class StringBuilderAndStringBuffer {
    public static void main(String[] args){
        String a = "abcdefg";
        StringBuilder sbd = new StringBuilder();
//        sb1 = a;//incompatible types
        sbd = new StringBuilder(a);
        StringBuffer sbf = new StringBuffer(a);//replace with StringBuilder
        
        System.out.println("reverse: " + sbd.reverse());
        System.out.println("reverse: " + sbd.reverse());
        System.out.println("replace 2, 4, 3: " + sbd.replace(2, 4, "34"));
//        System.out.println("replace a,A: "+ sbd. no such method.
        System.out.println("insert: " + sbd.insert(2, 3));
        System.out.println("delete2,4: " + sbd.delete(2, 4));
        System.out.println("deleteCharAt 2: " + sbd.deleteCharAt(2));
        System.out.println("insert2,cd : " + sbd.insert(2, "cd"));
//        System.out.println("insert: " + sbd);
        System.out.println("append: " + sbd.append("+hijk"));






    }
}
