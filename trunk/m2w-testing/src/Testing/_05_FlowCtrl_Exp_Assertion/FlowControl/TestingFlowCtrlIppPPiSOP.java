/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._05_FlowCtrl_Exp_Assertion.FlowControl;

import static Testing.util.SOP.sop;
/**
 * 1. i++ < 4, compare first, add next.
 * 2. ++i < 4, add first, compare next.
 * 3. do while, do first, compare next.
 * @author ruobo
 * @date Jul 28, 2011
 */
public class TestingFlowCtrlIppPPiSOP {
    public static void main(String[] args){
        $test1();
    }

    private static void $test1(){
        //1 normal for loop
        for(int i = 0; i < 4; i++){
            System.out.println("for normal i++: " + i);
        }
        //2 normal for loop ++i
        for(int i = 0; i < 4; i++){
            sop("for normal ++i: " + i);
        }
        //3 ++i in condition for
        for(int i = 0; ++i < 4;){
            sop("for ++i in condition: " + i);
        }
        //4 ++i in condition for
        for(int i = 0; i++ < 4;){
            sop("for i++ in condition: " + i);
        }
        //5 while ++i in while
        int i = 0;
        while(++i < 4){
            sop("while ++i: " + i);
        }
        i = 0;
        while(i++ < 4)
            sop("while i++: " + i);
        i = 0;
        //6 do while
        do{sop("do while ++i: " + i);}while(++i < 4);
        i = 0;
        do{sop("do while i++: " + i);}while(i++ < 4);
    }
}
