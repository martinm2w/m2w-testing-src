/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._07_Generics_Collections.Generics;

import java.util.*;
/**
 * 1. only ? super can add.
 * @author ruobo
 * @date Jul 24, 2011
 */
public class TestingWildCardAdding {
    public static void main(String[] args){
        
    }

    private void $test1_takesWildCardGtypeExtends(List<? extends Number> list){
        Number i = 6;
//        list.add(i); // can't
    }

    private void $test2_takesWildCardGtypeSuper(List<? super Integer> list){
        Integer i = 6;
        Object z = new Object();
        list.add(i);
//        list.add(z);
    }

    private void $test3_takesWildCardGtypeNone(List<?> list){
        Integer i = 6;
//        list.add(i);//fail
    }
}
