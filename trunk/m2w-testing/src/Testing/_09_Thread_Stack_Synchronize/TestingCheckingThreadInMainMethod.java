/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._09_Thread_Stack_Synchronize;

import static Testing.util.SOP.*;
import java.util.*;
/**
  great method: 
 * @author ruobo
 */
public class TestingCheckingThreadInMainMethod {
    public static void main(String[] args){
        TestingCheckingThreadInMainMethod m2w = new TestingCheckingThreadInMainMethod();
        m2w.test1();
        
        for(Object o : Thread.getAllStackTraces().entrySet())
            sop(o);
//            sop(Thread.getAllStackTraces());
        
        m2w.test1();
    }
    
    private void test1(){
        System.out.println("A");
        List A = new ArrayList<String>();
        A.add("A");
        System.out.println(A);
//        for(Object o : Thread.currentThread().getStackTrace())
//            sop(o);
        sop(Thread.currentThread().getName());
    }
}
