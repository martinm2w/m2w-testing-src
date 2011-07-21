/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._07_Generics_Collections.CompareAndSearch;

import java.util.*;

/**
 *
 * @author ruobo
 * @date Jul 10, 2011
 */
public class TestingCollectionsSorting {
    public static void main(String[] args){
        TestingCollectionsSorting tcs = new TestingCollectionsSorting();
        tcs.testingDefaultSorting();
    }
    
    /**
     * m2w: for nature order, " " comes before "CAPS" , "CAPS" before "lowers"
     */
    private void testingDefaultSorting(){
        List<String> l1 = new ArrayList<String>();
        l1.add("a");l1.add("b");l1.add("c");
        l1.add(" ");l1.add("a ");l1.add(" a");
        l1.add("A");l1.add("B");l1.add("C");
        Collections.sort(l1);
        for(String s : l1)
            System.out.println(">" + s + "<");
    }
}
