/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._05_FlowCtrl_Exp_Assertion.FlowControl;

import java.util.*;
/**
 * 1. iterator is get from a collection that implements iterable interface. calling a .iterator();
 * 2. iterator with generic will RTE if type don't match.
 * @author ruobo
 * @date Jul 23, 2011
 */
public class TestingIterator {
    public static void main(String[] args){
        TestingIterator m2w = new TestingIterator();
        m2w.test1();
    }

    private void test1(){
        List l1 = new ArrayList();
        l1.add("a");l1.add("a");l1.add("a");l1.add("a");l1.add("a");l1.add("a");l1.add(1);
        Iterator i = l1.iterator();
        while(i.hasNext()){
            System.out.print(i.next());
        }
    }
}
