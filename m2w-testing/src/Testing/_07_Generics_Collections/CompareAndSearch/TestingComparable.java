/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._07_Generics_Collections.CompareAndSearch;

/**
 * 1. need to implement compareTo(), and it takes 1 arg, and returns an int.
 * @author ruobo
 * @date Jul 23, 2011
 */
public class TestingComparable implements Comparable{
    public Object compareTo(Object o1, Object o2){
        return "s".compareTo("s");
    }

    @Override
    public int compareTo(Object o) {
//        throw new UnsupportedOperationException("Not supported yet.");
        return 1;
    }
}
