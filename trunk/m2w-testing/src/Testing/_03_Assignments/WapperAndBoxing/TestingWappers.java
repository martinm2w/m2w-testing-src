/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._03_Assignments.WapperAndBoxing;

/**
 *
 * @Author ruobo
 * @Date Mar 8, 2011
 */
public class TestingWappers {

//	====================================Attributes=============================================
    Integer i = 3;
    int j;
//	====================================main method=============================================
    public static void main (String[] args){
        TestingWappers t = new TestingWappers();
//        t.go();
        t.$test1();
    }

        
//	===================================util methods============================================
    public void go(){
        j=i;
        System.out.println(j);
        System.out.println(i);
    }

    //7/31/11 7:06 PM
    private void $test1(){
        System.out.println(Integer.valueOf("4",5));
        System.out.println(Character.MIN_RADIX);
        System.out.println(Character.MAX_RADIX);
        System.out.println(Integer.parseInt("11612312",16));
        Integer a = 4;
//        a.to
        Integer.toBinaryString(a);
//        
    }
//      =================================setters & getters=========================================


}
