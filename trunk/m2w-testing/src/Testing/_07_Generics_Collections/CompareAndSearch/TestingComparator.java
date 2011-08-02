/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._07_Generics_Collections.CompareAndSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * 1. need to implement compare(), takes 2 args. and return int.
 * @Author ruobo
 * @Date Mar 14, 2011
 */
public class TestingComparator {

//	====================================Attributes=============================================

//	====================================main method=============================================
    public static void main(String[] args){

        ArrayList<String> a = new ArrayList<String>();
        a.add("1");
        a.add("5");
        a.add("2");
        a.add("3");
        a.add("4");

        Collections.sort( a, new Comparator() {

            public int compare(Object o1, Object o2) {
//                Integer no1 = Integer.parseInt((String)o1);
//                Integer no2 = Integer.parseInt((String)o2);
//                return no1.compareTo(no2);// put smaller ones in front , output small to big list
//                throw new UnsupportedOperationException("Not supported yet.");
                return ((String)o1).compareTo((String)o2);
            }
        });
        System.out.println(a);


    }
//	===================================util methods============================================

//      =================================setters & getters=========================================


}
