package Testing._07_Generics_Collections.Arrays;

import java.util.*;
/**
 *
 * @author ruobo
 * @date Apr 25, 2012
 */
public class TestingArrayAndForEach {
    public static void main(String[] args){
//        String[] newArray = new String[5];
////        ArrayList a = new ArrayList();
//        newArray = {"a","b", "c", "d", "e"};
////	String[] newArray = {"a","b", "c", "d", "e"};
//        for(String s : newArray)
//            System.out.println(s);
    HashMap<String, ArrayList<HashMap<String, Integer>>> hsm = new HashMap<String, ArrayList<HashMap<String, Integer>>>();
        for(String s : hsm.keySet()){
            ArrayList<HashMap<String, Integer>> templist = hsm.get(s);
            for(HashMap<String, Integer> m : templist){
                for(String str : m.keySet()){
                    System.out.println(m.get(str));
                }
            }
        }



    }
}