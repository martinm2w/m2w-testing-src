/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._05_FlowCtrl_Exp_Assertion.Exception;

//import java.lang.Exception;

/**
 * 1. method "throws" exception, code "throw" exception
 * 2. try can follow by finally, no catch, if RuntimeException is to be thrown.
 * 3. throws Exception declaration comes after the method name and (), 
 * 4. delaring throw exception in code's literal is: throw new XxxException();
 * 5. if no catch, only finally, then finnaly's code comes before exception. and no code after the exception is ran.
 * @author ruobo
 * @date Jul 21, 2011
 */
public class TestingExceptionHandling {
    public static void main(String[] args){
//        TestingExceptionHandling m2w = new TestingExceptionHandling();
        try{
            System.out.println("before");
//            TestingExceptionHandling.go();//wouldn't compile without catch
            TestingExceptionHandling.go1();//runtime exception compiles
            System.out.println("after exception.");
        }
//        catch(Exception e){}
        finally{
            System.out.println("finnaly");
        }
    }
    
    private static void go() throws Exception{
        System.out.println("goes");
        throw new Exception();
    }
    private static void go1(){
        System.out.println("goes");
        throw new RuntimeException();
    }
}
