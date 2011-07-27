/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._01_Declare_Access.Access;

/**
 *
 * @author ruobo
 * @date Jul 14, 2011
 */
public class TestingAccess_file3 {
    public static void main(String[] args){
        TestingAccess_file1 fc = new TestingAccess_file1();
        fc.defaultMethod();fc.proctectedMethod();fc.publicMethod();//no private
        TestingAccess_file1.FileClassInnerClassProtected psfc = fc.new FileClassInnerClassProtected();
        //no private
        
        SubFileDefaultClass sfc = new SubFileDefaultClass();// don't need to import
    }
}

class ChildOfFileClassOfFile1 extends TestingAccess_file1{
    void doStuff(){
        ChildOfFileClassOfFile1 cfc = new ChildOfFileClassOfFile1();
        cfc.defaultMethod();cfc.proctectedMethod();cfc.publicMethod();//no private
        ChildOfFileClassOfFile1.FileClassInnerClassDefault dscfc = cfc.new FileClassInnerClassDefault();
        //all 4 , no private
    }
}

class ChildOfFileClassOfFile1SubClass extends SubFileDefaultClass{
    void doStuff(){
        ChildOfFileClassOfFile1SubClass csfc = new ChildOfFileClassOfFile1SubClass();
        csfc.defaultMethod();// no private
        ChildOfFileClassOfFile1SubClass.SubFileClassInnerClassDefault dscsfc;// no private
    }
}
