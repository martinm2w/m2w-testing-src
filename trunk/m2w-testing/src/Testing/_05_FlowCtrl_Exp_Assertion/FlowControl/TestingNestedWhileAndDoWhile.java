/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._05_FlowCtrl_Exp_Assertion.FlowControl;

/**
 * 1. while has to followed by a ; if there is any statement between do and while.
 * @author ruobo
 * @date Jul 23, 2011
 */
public class TestingNestedWhileAndDoWhile {
    public static void main(String[] args){
        TestingNestedWhileAndDoWhile m2w = new TestingNestedWhileAndDoWhile();
        m2w.test1();
    }
    private void test1(){
        int i = 1;
        int j = 0;
        do
//            System.out.println();
            while(j < 4)
                System.out.println(++j);
//                System.out.println();
         while (i > 1);
    }
}
