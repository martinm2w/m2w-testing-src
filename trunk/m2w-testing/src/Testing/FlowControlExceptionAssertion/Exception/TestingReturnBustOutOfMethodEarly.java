/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.FlowControlExceptionAssertion.Exception;

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
