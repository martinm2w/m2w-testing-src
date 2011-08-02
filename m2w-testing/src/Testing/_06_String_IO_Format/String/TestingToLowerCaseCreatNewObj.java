/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._06_String_IO_Format.String;

/**
 *
 * @author ruobo
 * @date Aug 1, 2011
 */
 class TestingToLowerCaseCreatNewObj {
    public static void main(String[] args){
        $test1();
    }
    static private void $test1(){
        String a = "hi";
        String c = "HI";
        String b = a.toLowerCase();
        String d = c.toLowerCase();
        System.out.println(a == b);
        System.out.println(a == d);
    }
}

//default interface a{}