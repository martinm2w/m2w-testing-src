/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._07_Generics_Collections.CompareAndSearch;

import java.util.*;

/**
 * m2w: Chp7Q16 here
 *      tested annonymous inner class building with Generic type.
 *      1. binarySearch() and sort() is a static method of Arrays class.
 *      2. can pass a comparator into binarySearch.
 *      3. can pass a comparator into Arrays.Sort()
 *      4. have to pass the same comparator(ok if not the same instance, but have the same ordering) 
 *         into the binarySearch in order to search for the value in the sorted list(if the list is sorted using the comparator).
 * @author ruobo
 * @date Jul 17, 2011
 */
public class TestingComparatorAndBinarySearch {
    
    public static void main(String[] args){
        TestingComparatorAndBinarySearch m2w = new TestingComparatorAndBinarySearch();
        m2w.Chp7Q16();
    }
    
    private void Chp7Q16(){
        String[] s = {"map", "pen", "marble", "key"};
        Arrays.sort(s, new Comparator<String>(){
            @Override
            public int compare(String o, String o1){
                return o1.compareTo(o);
            }
        });
        
        for(String s2 : s) System.out.print(s2 + " ");
        
        System.out.println(Arrays.binarySearch(s, "map"));
        //returns -1 because have to pass in the same comparator
        //trying to instanciate another comparator with the same ordering.
        Comparator<String> cmprtr = new Comparator<String>(){
            @Override
            public int compare(String o, String o1){
                return o1.compareTo(o);
            }
        };
        System.out.println(Arrays.binarySearch(s, "map", cmprtr));
    }
    
}
