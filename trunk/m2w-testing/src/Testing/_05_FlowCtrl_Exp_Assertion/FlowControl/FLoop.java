/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._05_FlowCtrl_Exp_Assertion.FlowControl;

/**
 *
 * @author ruobo
 * @lastupdate Sep 21, 2012
 */
public class FLoop {
//==============================constructor=====================================
//=============================public methods===================================
    public static void main(String[] args){
//        for(int i = 0; i < 10; i++){
//            for(int j = i+1; j < 10; j++){
//                System.out.println(i+" " + j);
//            }
//        }
//        for(int i = 0; i < 10; i++){
//            for(int j = 1; j > i && j< 10; j++){
//                System.out.println(i+" "+j);
//            }
//        }
//        
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < i; j++){
                System.out.println(i+" "+j);
            }
        }
    }
//============================private methdos===================================
//===========================instance variables=================================
//============================setters & getters=================================
}
