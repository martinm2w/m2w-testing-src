/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.GenericsAndCollections.Collections;

import java.util.ArrayList;

/**
 *
 * @Author ruoboindex
 * @Date Mar 14, 2011
 */
public class TestingArrayListProtectedRemoveRangeMethod extends ArrayList {

//	====================================Attributes=============================================
        
//	====================================main method=============================================
    public static void main(String[] args){
        TestingArrayListProtectedRemoveRangeMethod t = new TestingArrayListProtectedRemoveRangeMethod();
        ArrayList<String> A = new ArrayList<String>();
        A.add("1");
        A.add("2");
        A.add("3");
        A.add("4");
        A.add("5");
        A.add("6");
//        t.re
        t.add("1");//0
        t.add("2");//1
        t.add("3");//2
        t.add("4");//3
        t.add("5");//4
        t.add("6");//5

//        A.removeRange(2,6);//Compiler error: protected access in java.util.ArrayList
        t.removeRange(2, 6);//fromIndex, inclusive, and toIndex, exclusive, : another way to explain the (a,b) kind of arguments, a is index, b is index+1
        System.out.println(t);

    }


//	===================================util methods============================================
//    public ArrayList<String> removeAfterTen(ArrayList<String> in){
//        ArrayList<String> out = in;
//        out
//        return out;
//        
//
//    }
//      =================================setters & getters=========================================


}
