/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._07_Generics_Collections.Collections;

import java.util.*;
import Testing.util.SOP.*;
/**
 * m2w: 1. wild card is used when declaring a Generic Type not a Base type of an Variable.
 *      2. headset is < because the default order of values is from smallest to biggest.
 *      3. a common behavior in 2 args method is that args[0] is included and args[1] is excluded.
 *      ------ 7/20/11 12:57 PM
 *      1. adding objs which didn't implement Comparable into TreeSet will compile but will throw exception at runtime.
 * @author ruobo
 * @date Jul 17, 2011
 */
public class TestingTreeSet {
    public static void main(String[] args){
        TestingTreeSet ts = new TestingTreeSet();
//        ts.test1();
        ts.test2();
        
    }
    
    private void test1(){
        TreeSet<String> t = new TreeSet<String>();
        for(int i = 0; i < 10; i++)
            t.add(String.valueOf(i));
        this.sop("t: " +  t);
        this.sop("descending set t: " + t.descendingSet());
        this.sop("t: " +  t);
        this.sop("ceiling 4 >=: "  + t.ceiling("4"));//Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
        this.sop("floor4 <=: " + t.floor("4"));
        this.sop("higher4 >: " + t.higher("4"));
        this.sop("lower4 <: " + t.lower("4"));
        this.sop("first & last: " + t.first() + t.last());
        this.sop("headset4true <= :" + t.headSet("4" , true));
        this.sop("tailset4false > : " + t.tailSet("4", false));
        this.sop("subset 46: " + t.subSet("4", "6"));
        this.sop("subset 4true6true: " + t.subSet("4", true, "6", true));
        
    }
    
    private <T> void sop(T t){
        System.out.println(t);
    }
    
    private void test2(){
        TreeSet A = new TreeSet();
        A.add("A");
        
        sop(A);
        A.add(new Object());
//        sop("");
    }
//    private void sop1(<? extends Object> t){// is not used like this.
//        System.out.println(t);
//    }
}
