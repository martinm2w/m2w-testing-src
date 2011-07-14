/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.GenericsAndCollections.Generics;

import java.util.*;
/**
 *
 * @author ruobo
 * @date Jul 13, 2011
 */
public class TestingEnhancedForLoopOnListsWithoutGenerics {
    public static void main(String[] args){
        TestingEnhancedForLoopOnListsWithoutGenerics m2w = new TestingEnhancedForLoopOnListsWithoutGenerics();
        m2w.TestingEnhancedForLoopOnListsWithoutGenerics();
    }

    private void TestingEnhancedForLoopOnListsWithoutGenerics(){
        List<String> a = new ArrayList<String>();
        List b = new ArrayList<String>();//warnings about raw types but compiles

        a.add("a");a.add("b");a.add("c");
        b.add("a");b.add("b");b.add("c");
        b.add(1); b.add(new String[2]);// if declare b like this. when adding different type in, only a warning, no error.
        for(String s : a){
            System.out.println("a: " + s);
        }
//        for(String s : b){//requirs object.

        for(Object o : b){
            System.out.println("b: " + o + " - no overriding toString().");
        }

        for(Object o : b){
            if(o instanceof String) // of's o is lowercase!!!!
                System.out.println("b with cast and test: " + (String)o); // will cause runtime Exception
            if(o instanceof Integer)// int is autoboxed to Integer when added into List. cuz List can only hold Objects, no primitives.
                System.out.println("b with cast and test: " + (Integer)o);
            if(o instanceof String[])
                System.out.println("b with cast and test: " + (String[])o);//wow, this is the way to test an instanceof array
        }

        System.out.println();
        System.out.println("will fail on line 45");
        for(Object o : b){
            System.out.println("b with cast: " + (String)o); // will cause runtime Exception
        }

    }
}
