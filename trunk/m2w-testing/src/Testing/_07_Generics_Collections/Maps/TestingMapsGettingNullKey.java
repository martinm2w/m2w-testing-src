/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._07_Generics_Collections.Maps;

import java.util.*;
/**
 * 1. HashMap: getting a Key doesn't exist will return null at runtime, fine compiling. ok compiling if getting type don't match.
 * 2. TreeMap: fails at run time if getting different type other than the Key type. ok compiling if getting type don't match.
 * 3. TreeMap: K,V type must match after the first put. or will not compile.
 * @author ruobo
 * @date Jul 21, 2011
 */
public class TestingMapsGettingNullKey {
    public static void main(String[] args){
        Map<String, Integer> A = new HashMap<String, Integer>();
        A.put("A", 1);
        System.out.println(A.get("A") + " || " + A.get(1));
        Map<String, Integer> B = new TreeMap<String, Integer>();
        B.put("B", 1); 
//        B.put(1, "C"); //fail compiling.
        System.out.println(B.get("B") + " || "
                            + B.get("A")  + " || "
                            + B.get(1));//will fail.
    }
}
