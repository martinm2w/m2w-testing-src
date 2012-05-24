/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._05_FlowCtrl_Exp_Assertion.FlowControl;

/**
 *
 * @author ruobo
 */
public class TestingForLoopWithLable {
    public static void main(String[] args){
        outer:
        for(int i = 0; i < 3; i++){
            inner:
            for(int j = 0; j < 4; j++){
                if(true)
                    continue outer;
            }
        }
    }
}
