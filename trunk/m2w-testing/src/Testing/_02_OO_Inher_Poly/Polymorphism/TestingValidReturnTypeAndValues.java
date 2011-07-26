/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._02_OO_Inher_Poly.Polymorphism;

import java.util.*;
/**
 * 1. methods with obj ref return type can accept null as return value.
 * 2. with void return type , can return nothing. return;
 * 3. interface as return type can return an implementer.
 * @author ruobo
 * @date 7/26/11 11:45 AM
 */
public class TestingValidReturnTypeAndValues {
    public static void main(String[] args){
        
    }
    
    private List $test1(){
        return null;
    }
    
    private void $test2(){
        return;
    }
    
    private Comparable $test3(){
        return new Comparable(){
            @Override
            public int compareTo(Object obj1){
                return 1;
            }
        };
    }
}
