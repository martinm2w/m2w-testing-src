/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._07_Generics_Collections.Generics;

import java.util.*;
        
/**
 *
 * @author ruobo
 * @date Jul 11, 2011
 */
public class TestingGenericsAndTypeSafe {
    public static void main(String[] args){
        TestingGenericsAndTypeSafe gnt = new TestingGenericsAndTypeSafe();
//        gnt.testBadLegacy();
        gnt.testUnsafeAddAndPrint();
    }

    private void testBadLegacy(){
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(4);
        myList.add(6);
        Inserter in = new Inserter();
        in.insert(myList);
        System.out.println(myList);
    }

    /**
     * m2w: so there is a cast when getting myList.get(i), cause it returns a String as it declared as List<String> type.
     * it's ok do add , but fails at runtime. even though there will be warningss.
     * @date 7/13/11 9:06 PM
     */
    private void testUnsafeAddAndPrint(){
        List<String> myList = new ArrayList<String>();
        myList.add("a");
        myList.add("b");
        this.testUnsafeAddAndPrintUtilMethod_UnsafeAdd(myList);
//        myList.add(1);//can't add directly like this. have to do it from another method that takes a List
        for(int i = 0; i < myList.size(); i++){
            System.out.println("getting" + i + " :" + myList.get(i));
            //java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        }

    }

    private void testUnsafeAddAndPrintUtilMethod_UnsafeAdd(List list){
        list.add(1); //[unchecked] unchecked call to add(E) as a member of the raw type java.util.List
        list.add("c");
    }


}

class Inserter{
    void insert(List list){//unchecked call to add(E) as a member of the raw type java.util.List
        list.add(new Integer(42));
        list.add(new String("43"));
        list.add("44");
    }
}