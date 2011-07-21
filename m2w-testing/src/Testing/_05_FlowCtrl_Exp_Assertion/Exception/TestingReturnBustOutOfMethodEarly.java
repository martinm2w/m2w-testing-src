/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._05_FlowCtrl_Exp_Assertion.Exception;

/**
 *
 * @author ruobo
 */
public class TestingReturnBustOutOfMethodEarly {
    
    public static void main(String[] args){
        
        
        
    }
    
    private void doStuff(){
        System.out.println(1);
        return;
//        System.out.println(2); // unreachable statement couldn't compile.
        
    }
    
}
