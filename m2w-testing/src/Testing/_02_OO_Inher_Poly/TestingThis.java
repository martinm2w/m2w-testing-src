/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._02_OO_Inher_Poly;

/**
 * m2w: 1. non-static variable this cannot be referenced from a static context
 *      2. ref from in to outter need to use OuterClassName.this, "this" ref-to inner class instance.
 * @author ruobo
 * @date 7/20/11 1:47 PM
 */
public class TestingThis {
    public static void main(String[] args){
        TestingThis m2w = new TestingThis();
        m2w.test1();
        TestingThis.test1_s();
        TestingThis.Inner m2win = m2w.new Inner();
        m2win.test2_inner();
        
    }
    //7/20/11 1:37 PM
    private void test1(){
        System.out.println(this + " : ok pass it to itself in non-static");
    }
    //7/20/11 1:37 PM
    private static void test1_s(){
//        System.out.println(this);//non-static variable this cannot be referenced from a static context
        System.out.println("non-static variable this cannot be referenced from a static context ");
    }
    
    //7/20/11 1:48 PM
    class Inner{
        private void test2_inner(){
            System.out.println("from inner class: ref-to outter class - " + TestingThis.this);
            System.out.println("from inner class: ref-to inner class - " + this);
        }
    }
}
