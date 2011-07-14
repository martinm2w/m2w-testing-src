/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.Access2;

import Testing.Access.*;
/**
 *
 * @author ruobo
 * @date Jul 14, 2011
 */
public class TestingAccess_file2 {
    public static void main(String[] args){
        TestingAccess_file1 fc1 = new TestingAccess_file1();
        fc1.publicMethod();//only public
//        SubFileDefaultClass sfc = new SubFileDefaultClass();
//        Testing.Access.SubFileDefaultClass is not public in Testing.Access; cannot be accessed from outside package
        TestingAccess_file1.FileClassInnerClassPublic sfc = fc1.new FileClassInnerClassPublic();
        sfc.publicMethod();
//        TestingAccess_file1.FileClassInnerClassProtected pfc
//                = fc1.new FileClassInnerClassProtected();
//        //only public inner class can be seen
        
    }
}

//class ChildOfSubFileClassInPackage1 extends SubFileDefaultClass{} // cannot be access out of package

class ChildOfFileClassInPackage1 extends TestingAccess_file1{
    void doStuff(){
        //default cannot be passed by inheritance 
        this.proctectedMethod();
        this.publicMethod();
    }
    public static void main(String[] args){
        ChildOfFileClassInPackage1 cfc1 = new ChildOfFileClassInPackage1();
        cfc1.proctectedMethod();cfc1.publicMethod();// no default too.
        ChildOfFileClassInPackage1.FileClassInnerClassProtected scfc1 ;// can declare type however
//             scfc1   = cfc1.new FileClassInnerClassProtected();// counldn't access if the protected inner class don't have a public constructor
        ChildOfFileClassInPackage1.FileClassInnerClassProtectedWithPublicConstructor scfc2;
        scfc2 = cfc1.new FileClassInnerClassProtectedWithPublicConstructor();
        scfc2.publicMethod();
    }
}