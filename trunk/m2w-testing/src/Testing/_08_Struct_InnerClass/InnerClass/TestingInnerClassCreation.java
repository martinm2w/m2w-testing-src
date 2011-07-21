/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._08_Struct_InnerClass.InnerClass;

import static Testing.util.SOP.*;
/**
 * m2w: 
 * 1. inner class can be declared with all access modifiers.
 * 2. instantiation in static methods notice: cannot use "this", cuz "this" can only be used in instance methods.
 * 3. "this" can be used in creation only if it's in the instance method of the Outter class.
 * @author ruobo
 */
public class TestingInnerClassCreation {
    public static void main(String[] args){
        TestingInnerClassCreation m2w = new TestingInnerClassCreation();
        m2w.test1();
    }
    
    /**
     * m2w from instance methods.
     * @date 7/20/11 2:13 PM
     */
    private void test1(){
        //1
        TestingInnerClassCreation.Inner1 in1 = new TestingInnerClassCreation.Inner1();
        //2
        TestingInnerClassCreation.Inner1 in1_1 = new TestingInnerClassCreation().new Inner1();
        //3
        TestingInnerClassCreation out1 = new TestingInnerClassCreation();
        TestingInnerClassCreation.Inner1 in1_2 = out1.new Inner1();
        //4
        TestingInnerClassCreation.Inner1 in1_3 = this.new Inner1();
        //sop
        sop(in1);sop(in1_1);sop(in1_2);sop(in1_3);
    }
    
    /**
     * m2w: from static methods.
     * @date 7/20/11 2:14 PM
     */
    private static void test2(){
        //1 fail
//        TestingInnerClassCreation.Inner1 in1 = new TestingInnerClassCreation.Inner1();
        //2
        TestingInnerClassCreation.Inner1 in1_1 = new TestingInnerClassCreation().new Inner1();
        //3
        TestingInnerClassCreation out1 = new TestingInnerClassCreation();
        TestingInnerClassCreation.Inner1 in1_2 = out1.new Inner1();
        //4 fail
//        TestingInnerClassCreation.Inner1 in1_3 = this.new Inner1();
    }
    
    
    
    private class Inner1{}
    class Inner2{} 
    protected class Inner3{}
    public class Inner4{}
}
