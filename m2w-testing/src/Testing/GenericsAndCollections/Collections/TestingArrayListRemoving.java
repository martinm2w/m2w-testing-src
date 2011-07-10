/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.GenericsAndCollections.Collections;

import java.util.ArrayList;

/**
 *
 * @Author ruobo
 * @Date Apr 16, 2011
 */
public class TestingArrayListRemoving {

//	====================================Attributes=============================================

//	====================================main method=============================================
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(3);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        ArrayList<Integer> B = new ArrayList<Integer>(a);
        
//        for(int i = 1; i < a.size(); i++){
        for(int i = 0; i < a.size()-1; i++){
            int b = a.get(i);
//            int b1 = a.get(i-1);
            int b1 = a.get(i+1);

            System.out.println(i);
            System.out.println(b);
            System.out.println(b1);
            System.out.println(a);



            if(b == b1){

                a.remove(i);
                i--;
            }
        }
        
        
        for(int i = 0; i < B.size(); i++){
            System.out.println(i);
            if (B.get(i) == 3){            
                B.remove(i);
                i--;
            }
        }

        System.out.println(a);
        System.out.println("B" + B);

    }
//	===================================util methods============================================

//      =================================setters & getters=========================================


}
