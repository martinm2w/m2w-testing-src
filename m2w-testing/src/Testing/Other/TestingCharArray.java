/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.Other;

import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @Author ruobo
 * @Date Apr 9, 2011
 */
public class TestingCharArray {

//	====================================Attributes=============================================

//	====================================main method=============================================
    public static void main(String[] args){

        char[] Blist = "destination".toCharArray();
//        Character [] Blist = "destination".toCharArray();
        System.out.println(Blist);
        ArrayList<Character> Alist = new ArrayList<Character>();
        for(char value: Blist){
            Alist.add(value);
        }
        System.out.println(Alist);


        int[] C = {0,1,2,3};
        List Clist =  new ArrayList<Integer>();
        List Dlist = Clist;
        for(int value: C){
            Clist.add(value);
        }
        System.out.println(Clist);
//        System.out.println(Dlist);

        
        
    }
//	===================================util methods============================================

//      =================================setters & getters=========================================


}
