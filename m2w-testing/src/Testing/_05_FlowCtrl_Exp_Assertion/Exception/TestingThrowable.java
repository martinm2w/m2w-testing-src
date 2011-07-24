/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._05_FlowCtrl_Exp_Assertion.Exception;

/**
 *
 * @author ruobo
 * @date Jul 23, 2011
 */
public class TestingThrowable {
    public static void main(String[] args) throws Throwable{
        try{
            throw new Throwable();
//            System.out.println("try");
        }catch(Exception e){
            System.out.println("exc");
        }finally{
            System.out.println("fin");
        }
    }

    private void test1(){
        
    }
}
