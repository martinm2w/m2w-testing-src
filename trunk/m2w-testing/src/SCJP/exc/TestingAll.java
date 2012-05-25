/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SCJP.exc;

import java.util.*;
/**
 *
 * @author ruobo
 * @date Aug 8, 2011
 */
public class TestingAll extends $test{
//    static int i = 0;
    public static void main(String[] args){
        int j;
        TestingAll m2w = new TestingAll();
//        i = 4;
        j=4;
        System.out.println(j);
        for(;;) {}
//            System.out.println();
        

    }

    private void $test1(){
//        super();
    }

    TestingAll(){
        super(j);
//        super(i);
    }
}

class $test{
    int i = 5;
    static int j = 6;
    $test(){}
    $test(int i){}
}


class $test1 implements Comparable{
    @Override
    public int compareTo(Object o){
        return "aa".compareTo("b");
    }
}

class $test2{
    static String s;
    public static void main(String[] args){
        System.out.println(s);
//        final String qq = "s";
//        List A = {1,2,3};
        int[] a = {1,2};
        List A = new ArrayList<String>();
        List<String> b = new ArrayList();
        class innerA{
//            static int qqq = 0;
            String d = s;
//            d = qq;
        }
    }
}