/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._07_Generics_Collections.Maps;

import java.util.*;
/**
 * m2w: tested annonymous inner class instanciation without a reference
 *      test1(): regular TreeMap operations.
 *      test2(): TreeMap constructor takes a Object which implements comparator.
 *      scjpCh7Q13: notice.
 *      1. map has 2 args when declaring Generic types
 *      2. subMap() with boolean args will return of type NaviableMap<K,V>, without boolean args will return of type SortedMap
 *          which cannot be casted into TreeMap directly
 *      3. ceiling/floor entry/key methods' args are all keys.
 *      4. higher >, lower <, these are exclusive.
 *      5. floor <=, ceiling >=, these are inclusive.
 *      6. subMap, tailMap, are inclusive, subMap's args[1] and headMap is exclusive.
 *      7. all that get something from the mid to the index before it, is exclusive, all that get something from the mid to index after it is inclusive. 
 * @author ruobo
 * @date Jul 17, 2011
 */
public class TestingTreeMap {
    public static void main(String[] args){
        TestingTreeMap tm = new TestingTreeMap();
        tm.test1();
        System.out.println("======================");
        tm.test2();
        System.out.println("======================");
        tm.scjpCh7Q13();
    }
    
    private void test1(){
        TreeMap<String, String> tm = new TreeMap<String, String>();
        tm.put("1", "a");
        tm.put("2", "b");
        tm.put("4", "d");
        tm.put("5", "e");
        NavigableMap<String, String> tmsub =  tm.subMap("2", true, "4", true);
        this.sop(tmsub);
        tm.put("3", "c");
        this.sop("after the put3c");
        this.sop("tm: " + tm);
        this.sop("sub: " + tmsub);
        this.sop("floorkey 2 : " + tm.floorKey("2"));
        this.sop("ceilingentry d: " + tm.ceilingEntry("3"));
        
    }
    
    /**
     * with comparator
     */
    private void test2(){
        TreeMap<String, String> tm = new TreeMap<String, String>(new Comparator(){
            @Override
             public int compare(Object o, Object o1){
                return o1.toString().compareTo(o.toString());
            }
        });
        tm.put("1", "a");
        tm.put("2", "b");
        tm.put("3", "c");
        tm.put("4", "d");
        
        System.out.println(tm);
    }
    
    
    private void scjpCh7Q13(){
        TreeMap<String, String> myMap = new TreeMap<String, String>();
        myMap.put("a", "apple");myMap.put("d", "date");
        myMap.put("f", "fig");myMap.put("p", "pear");
        this.sop(": " + myMap.higherKey("f"));
        this.sop(": " + myMap.ceilingKey("f"));
        this.sop(": " + myMap.floorKey("f"));
        
        SortedMap<String, String> sub = myMap.tailMap("f");
        SortedMap<String, String> head = myMap.headMap("f");
        this.sop(sub);
        this.sop(head);
        this.sop(": " + sub.firstKey());
        
    }
    private <T> void sop(T t){
        System.out.println(t);
    }
}
