/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.GenericsAndCollections.Generics;

import java.util.*;
        
/**
 *
 * @author ruobo
 * @date Jul 11, 2011
 */
public class TestingGenericsAndTypeSafe {
    public static void main(String[] args){
        TestingGenericsAndTypeSafe gnt = new TestingGenericsAndTypeSafe();
        gnt.testBadLegacy();
    }

    private void testBadLegacy(){
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(4);
        myList.add(6);
        Inserter in = new Inserter();
        in.insert(myList);
        System.out.println(myList);
    }
    
   
}

class Inserter{
    void insert(List list){
        list.add(new Integer(42));
        list.add(new String("43"));
        list.add("44");
    }
}