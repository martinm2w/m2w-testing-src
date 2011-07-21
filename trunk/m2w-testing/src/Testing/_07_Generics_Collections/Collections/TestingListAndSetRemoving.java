/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._07_Generics_Collections.Collections;

import java.util.*;

/**
 *
 * @Author ruobo
 * @Date Apr 16, 2011
 */
public class TestingListAndSetRemoving {

//	====================================Attributes=============================================

//	====================================main method=============================================
    public static void main(String[] args){
        TestingListAndSetRemoving lsr = new TestingListAndSetRemoving();
//        lsr.oldTesting();
//        lsr.removingObjectList();
        lsr.removingObjectSet();
        
    }

    private void oldTesting(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(3);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        ArrayList<Integer> B = new ArrayList<Integer>(a);
        
//        for(int i = 1; i < a.size(); i++){
        for(int i = 0; i < a.size()-1; i++){
            int b = a.get(i);
//            int b1 = a.get(i-1);
            int b1 = a.get(i+1);

            System.out.println(i);
            System.out.println(b);
            System.out.println(b1);
            System.out.println(a);



            if(b == b1){

                a.remove(i);
                i--;
            }
        }
        
        
        for(int i = 0; i < B.size(); i++){
            System.out.println(i);
            if (B.get(i) == 3){            
                B.remove(i);
                i--;
            }
        }

        System.out.println(a);
        System.out.println("B" + B);

    }

    private void removingObjectList(){
        List<String> l1 = new ArrayList<String>();
        String e = "e";
        l1.add("a");l1.add("b");l1.add("c");l1.add("d");l1.add(e);
        System.out.println("original: " + l1);
        l1.remove(e);
        System.out.println("e removed: " + l1);
        l1.remove("b");
        System.out.println("\"b\" removed: " + l1);
        
    }
    
    private void removingObjectSet(){
        Set<String> s1 = new HashSet<String>();
        String e = "e";
        s1.add("a");s1.add("b");s1.add("c");s1.add("d");s1.add(e);
        System.out.println("original: " + s1);
        s1.remove(e);
        System.out.println("e removed: " + s1);
        s1.remove("b");
        System.out.println("\"b\" removed: " + s1);
        
    }
}
