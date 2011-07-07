package Testing.CollectionsAndArrays;


import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruobo
 */
public class TestingArrayListSizeGet {

   

    public static void main(String[] args){

        ArrayList<String> A = new ArrayList<String>();
        A.add("a");
        A.add("b");
        A.add("c");


        System.out.println("s = "+ A.size());
        System.out.println("s - 1 :"+ A.get(A.size() - 1 ));
        // if get(A.size()),
        // then : Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 3, Size: 3

        for (int i = 0; i < A.size(); i ++){
            System.out.println(A.get(i));
        }

        

    }
    

}
