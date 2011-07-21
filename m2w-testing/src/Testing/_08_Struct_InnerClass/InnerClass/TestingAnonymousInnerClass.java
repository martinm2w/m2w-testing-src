/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._08_Struct_InnerClass.InnerClass;

import java.util.*;
/**
 * test1(): 1. empty instantiation of extending ArrayList
 *          2. instantiation of inheritance with overriding the toString method in ArrayList. (ends with "};")
 *          3. no-ref instantiation of inheritance when pass-in a object to a method. (ends with "});")
 *          
 * @author ruobo
 * @date 7/20/11 2:26 PM
 */
public class TestingAnonymousInnerClass {
    public static void main(String[] args){
        
    }
    
    private void test1(){
        //1 just a empty
        List<String> a = new ArrayList<String>(){
        };
        //2
        List a1 = new ArrayList<String>(){
          @Override
          public String toString(){
              return "Override a1";
          }
        };
        //3
        this.test1_in(new ArrayList<String>(){
            @Override
            public String toString(){
                return "test1_3";
            }
        });
    }
    
    private void test1_in(List list){
        list.add("1_in");
    }
}
