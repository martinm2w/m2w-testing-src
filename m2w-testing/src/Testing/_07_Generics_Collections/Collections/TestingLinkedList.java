/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._07_Generics_Collections.Collections;


import java.util.*;
/**
 * m2w: 1. get=peek, element()=getfirst, peek=peekfirst, but get() getFirst() and element() throw exception when empty;
 *      2. addFirst and addLast will add nomatter what, but offerFirst & last will add if the capacity allowed and will return true if success.
 *      3. remove = removeFirst, 
 *      4. removeFirstOccurrence & Last, is very usful.
 *      5. add and offer is at the end of the list.
 * @author ruobo
 * @date Jul 17, 2011
 */
public class TestingLinkedList {
    public static void main(String[] argss){
        TestingLinkedList tl = new TestingLinkedList();
        tl.test1();
    }
    
    private void test1(){
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("2");l1.add("1");l1.add("3");l1.add("4");l1.add("0");l1.add("9");l1.add("8");l1.add("7");
        System.out.println("after adding: " + l1);
        Collections.sort(l1);
        System.out.println("after sorting: " + l1);
        l1.add("added1");
        l1.addFirst("addfirst2");
        l1.addLast("addlast3");
        l1.offer("offered4");
        l1.offerFirst("offerfirst5");
        l1.offerLast("offerlast6");
        System.out.println("after adding: " + l1);
        System.out.println("polled: " + l1.poll());        
        System.out.println("pollfirst: " + l1.pollFirst());
        System.out.println("polllast: " + l1.pollLast());
        System.out.println("after polling: " + l1);
        String q = l1.pop();
        System.out.println("poped: " + q);
        l1.push(q);
        System.out.println("pushed q: " + l1);
        l1.removeFirst();l1.removeLast();
        System.out.println("removed first and last: " + l1);
        l1.add(1, "delete_me");l1.add(5, "delete_me");l1.add(2, "delete_me");l1.add(4, "delete_me");
        System.out.println("prepare for remove occur: " + l1);
        l1.removeFirstOccurrence("delete_me");
        System.out.println("removed first occ: " + l1);
        l1.removeLastOccurrence("delete_me");
        System.out.println("removed last occ: " + l1);
        l1.remove("delete_me");
        System.out.println("removed once: " + l1);
    }
}

