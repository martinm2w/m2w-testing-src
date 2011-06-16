/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.Other;

import java.util.ArrayList;

/**
 *
 * @Author ruobo
 * @Date Apr 30, 2011
 */
public class TestingCloneAndCopyObjects {

//	====================================Attributes=============================================

//	====================================main method=============================================
public static void main(String[] args){

    ArrayList<String> A = new ArrayList<String>();
    A.add("a");
    A.add("b");
    A.add("c");

    ArrayList<String> B = new ArrayList<String>(A);
    ArrayList<String> C = new ArrayList<String>();
    C.addAll(A);
    ArrayList<String> D = (ArrayList<String>)A.clone();
    A.add("d");
    B.add("B");
    C.add("C");
    D.add("D");

    System.out.println(A + " " + A.hashCode() );
    System.out.println(B + " " + B.hashCode() );
    System.out.println(C + " " + C.hashCode() );
    System.out.println(D + " " + D.hashCode() );
}
//	===================================util methods============================================

//      =================================setters & getters=========================================


}
