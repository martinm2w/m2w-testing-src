/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.Other;

import java.util.ArrayList;

/**
 *
 * @Author ruobo
 * @Date Mar 13, 2011
 */
public class TestingCopyAndRefObjectsAndVariables {

//	====================================Attributes=============================================

//	====================================main method=============================================
    public static void main(String[] args){
        Integer i = new Integer(2);
        Integer j = new Integer(0);
        Integer h = i;
        j = i;
//        h = i;
        i = 5;

        System.out.println("i: " +i+ ",j: " +j+ ",h: " +h);

        //testing copy of an object , and reference to an object
        ArrayList<String> a = new ArrayList<String>();
        a.add("a");
        ArrayList<String> b = a;
        ArrayList<String> c = new ArrayList<String>();
//        c.addAll(a);
        c = (ArrayList<String>)a.clone();
        a.add("b");
//        a = 
//        a.add(c);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

    }
//	===================================util methods============================================

//      =================================setters & getters=========================================


}
