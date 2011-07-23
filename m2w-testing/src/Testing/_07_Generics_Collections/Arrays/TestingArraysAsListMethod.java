/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._07_Generics_Collections.Arrays;

import java.util.*;
/**
 * 1. primitive arrays 's asList will return an Obj. as the only Obj in list b.
 * 2. wrapper arrays 's asList will return a list of wrappers.
 * 3. list returned by asList() is backed. can't add, remove, nor clear.
 * 4. backed so changes will be applied to both.
 * @author ruobo
 * @date Jul 23, 2011
 */
public class TestingArraysAsListMethod {
    public static void main(String[] args){
        TestingArraysAsListMethod m2w = new TestingArraysAsListMethod();
        m2w.$test1();
    }

    private void $test1(){
        Integer[] a = {1,2,3,4};
        int[] a1 = {1,2,3,4};
        List b = Arrays.asList(a);
        List b1 = Arrays.asList(a1);

        for(int i : a)    System.out.print(i);
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(b);
//        b.add(5);
//        b.remove(1);
//        b.clear();
        System.out.println();
        b.set(0, 5);
        System.out.println(b);
        for(int i : a)    System.out.print(i + " ");
    }
}
