/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._06_String_IO_Format.String;

/**
 *
 * @author ruobo
 */
public class TestingHalfAndFullWidth {
    public static void main(String[] args){
        char full = '？';
        char half = '?';
        System.out.println(Integer.toHexString(full));
        System.out.println(Integer.toHexString(half));
        System.out.println("\u003f");
    }
}
