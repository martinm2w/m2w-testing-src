/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.Other;

import java.util.*;


/**
 *
 * @Author ruobo
 * @Date Feb 28, 2011
 */
public class TestingStringSplit {

    public static void main(String[] args){

        String A = "The quintile score carol is: 5 --- actual score: 0.36585365853658536";
        ArrayList<String> AA = new ArrayList(Arrays.asList(A.split(" ", -1)));
//        System.out.println(AA.get(3)+ " " + AA.get(5));
        AA.add(3, "added");
        AA.add(3, "added");
        System.out.println(AA);
        String yo = null;
//        for (int i = 0; i < AA.size(); i++){
//            yo = AA.get(i);
//            do{
//                AA.add(i, "%%%");
//            }while(yo.equals("score"));
//
//        }
        String tempStr = "processing: Mar14_GroupA Finished.xml";
        String D = tempStr.split(" ", -1)[1].split("_")[0] + "" +tempStr.split(" ", -1)[1].split("_")[1].split("Group")[1];
        System.out.println(D);

        String testingBlanks = " but looking harder, there's a reason it hasn't he";
        String[] blankList = testingBlanks.split(" ");
        System.out.println("b List: " + Arrays.asList(blankList));
        
    }
//	====================================Attributes=============================================

//	====================================cal method=============================================

//	===================================util methods============================================

//      =================================setters & getters=========================================


}
