/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._07_Generics_Collections.Collections;

import java.util.*;
/**
 * m2w: test1. normal constructor and behavior.
 *      test2. constructor that takes in a collection.
 *      test3. constructor that takes in a int: size, and a Object that implements Comparator.
 *             tested annonymous inner class flavor 2, implementing interface in test3
 *      1. comparator is an interface. remember
 * @author ruobo
 * @date Jul 17, 2011
 */
public class TestingPriorityQueue {
    
    public static void main(String[] args){
        TestingPriorityQueue tpq = new TestingPriorityQueue();
//        tpq.test1();
//        tpq.test2();
        tpq.test3();
    }
    
    /**
     * test1. normal constructor and behavior.
     * @date 7/17/11 9:50 AM
     */
    private void test1(){
        PriorityQueue<String> pq1 = new PriorityQueue<String>();
        pq1.add("1.added");
        pq1.offer("2.offered");
        pq1.offer("3.offered");
        System.out.println(pq1);
        System.out.println("peeked: " + pq1.peek());
        System.out.println("poll: " + pq1.poll());
        System.out.println("after polled" + pq1);
    }
    
    private void test2(){
        List<String> a = new ArrayList<String>();
        a.add("d");a.add("b");a.add("c");a.add("1");a.add("a");
        PriorityQueue<String> pq2 = new PriorityQueue<String>(a);
        System.out.println("a: " + a);
        System.out.println("pq1: " + pq2);
    }
    
    private void test3(){
        List<String> a = new ArrayList<String>();
        a.add("d");a.add("a");a.add("c");a.add("b");
        System.out.println("a: " + a);
//        C c = new C();
        Comparator c = new Comparator(){
            @Override
            public int compare(Object t, Object t1) {
                return t1.toString().compareTo(t.toString());
            }            
        };
        PriorityQueue<String> pq3 = new PriorityQueue<String>(100 , c);
        pq3.offer("d");pq3.offer("a");pq3.offer("c");pq3.offer("b");
        System.out.println("pq3.offered: " + pq3);
        pq3.clear();
        pq3.add("d");pq3.add("a");pq3.add("c");pq3.add("b");
        System.out.println("pq3.added: " + pq3);
        pq3.clear();
        pq3.addAll(a);
        System.out.println("pq3.addedAll: " + pq3);
    }
    
    
    
    
    
}


//class C implements Comparator{
//            @Override
//            public int compare(Object t, Object t1) {
//                return t1.toString().compareTo(t.toString());
//            }
//        }