/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._05_FlowCtrl_Exp_Assertion.Exception;

/**
 * 1. any methoda can declare they throws exception but they don't need to actually throw it.
 * 2. free to try-catch empty statement.
 * 3. calling methods that throw exceptions needs to be declared or try-catched.
 * 4. declared-but-don't-actually-throw methods will run with no Exception.
 * 
 * @author ruobo
 * @date Jul 27, 2011
 */
public class TestingMainThrowsButNotThrowExp{
    public static void main(String[] args) throws Exception{
        $test1();
    }

    private static void $test1() throws Exception{
//        try{
//
//        }catch(Exception e){e.printStackTrace();}
    }
}
