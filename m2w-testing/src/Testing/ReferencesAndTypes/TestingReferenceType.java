/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.ReferencesAndTypes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Author ruobo
 * @Date Apr 18, 2011
 */
public class TestingReferenceType {

//	====================================Attributes=============================================

//	====================================main method=============================================

public static void main(String [] args){

    List A = new ArrayList<String>();
    A.add("oh");
    Object AA = A.get(0).toString();

    System.out.println(AA);


    
}
//	===================================util methods============================================

//      =================================setters & getters=========================================


}
