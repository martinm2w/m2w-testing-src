/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.Ref_Types_ClassStructure.InnerClass;

/**
 * test1(): 1. static inner class can only be instantiated via Out.In name = new Out.In(); this way.
 * @author ruobo
 */
public class TestingStaticInnerClass {
    public static void main(String[] args){
        
    }
    
    private void test1(){
        TestingStaticInnerClass outter = new TestingStaticInnerClass();
        TestingStaticInnerClass.inner_reg inner_reg = this.new inner_reg();
//        TestingStaticInnerClass.inner_static inner_static = this.new inner_static();// not working.
        TestingStaticInnerClass.inner_static inner_static = new TestingStaticInnerClass.inner_static();
//        inner_static = outter.new inner_static();// won't work either
//        inner_static = outter.new inner_static();
    }
    
    class inner_reg{}
    static class inner_static{}
}
