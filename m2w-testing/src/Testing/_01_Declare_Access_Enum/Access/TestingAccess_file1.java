/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._01_Declare_Access_Enum.Access;



/**
 *
 * m2w: conclude:
 * =========same file==========
 * 1.   u get to choose which main class to run if u have multiple.
 * 2.   can't see private even through inheritance. nor through instansiation.
 * 2.1  u can't declare static methods in inner classes.
 * ======outside package=======
 * 3.   if wanna access another class in annother package, have to import.
 * 4.   only use file default access classes for helping main class. because they can't be accessed out put package
 * 5.   no default and private access out of package through instansiation nor inheritance.
 * 5.1  public inner class instansiated out of package can only see public methods.
 * 6.   protected inner class cannot be seen through instansiation out of package.
 * 7.   protected inner class can be seen through inheritance outside package,
 * 8.   protected inner class can be declared as a type out of package through 7, however it cannot be instansiated if the protected inner class doesn't have a public constructor. (see in file2) 
 * 8.1  protected inner class can be instansitated through inheritance can only see public method. not even static final int constants.
 * ========same package========
 * 9.   no private inner class can be seen through instansiation in same package
 * 10.  only no private method / class access in same package.
 * 11.  no need to import using file class and default file classes
 * @author ruobo
 * @date Jul 14, 2011
 */
public class TestingAccess_file1 {
    public static void main(String[] args){
        System.out.println("file main");
        TestingAccess_file1 fc = new TestingAccess_file1();
        SubFileDefaultClass sfc = new SubFileDefaultClass();
        fc.defaultMethod();fc.proctectedMethod();fc.publicMethod();fc.privateMethod();
        
        sfc.defaultMethod();sfc.proctectedMethod();sfc.publicMethod();// no private
        
        TestingAccess_file1.FileClassInnerClassDefault fcd = fc.new FileClassInnerClassDefault();
        fcd.defaultMethod();fcd.privateMethod();fcd.proctectedMethod();fcd.publicMethod();
        
        TestingAccess_file1.FileClassInnerClassPrivate fcp = fc.new FileClassInnerClassPrivate();
        fcp.defaultMethod();// all 4 methods works fine
        //all 5 inner classes in file class should have access to their everything.
        
        SubFileDefaultClass.SubFileClassInnerClassDefault sfcd = sfc.new SubFileClassInnerClassDefault();
        //can't see sub file's private inner class
        
    }
    
    private void privateMethod(){}
    protected void proctectedMethod(){}
    void defaultMethod(){}
    public void publicMethod(){}
    static void staticMethod(){}
    
    
    private class FileClassInnerClassPrivate{private void privateMethod(){}    protected void proctectedMethod(){}    void defaultMethod(){}    public void publicMethod(){}}
    public class FileClassInnerClassPublic{private void privateMethod(){}    protected void proctectedMethod(){}    void defaultMethod(){}    public void publicMethod(){}}
    protected class FileClassInnerClassProtected{private void privateMethod(){}    protected void proctectedMethod(){}    void defaultMethod(){}    public void publicMethod(){}    }
    class FileClassInnerClassDefault{private void privateMethod(){}    protected void proctectedMethod(){}    void defaultMethod(){}    public void publicMethod(){}}
    static class FileClassInnerClassStatic{private void privateMethod(){}    protected void proctectedMethod(){}    void defaultMethod(){}    public void publicMethod(){}}
    
    protected class FileClassInnerClassProtectedWithPublicConstructor{
        public FileClassInnerClassProtectedWithPublicConstructor(){}
        private void privateMethod(){}    protected void proctectedMethod(){}    void defaultMethod(){}    public void publicMethod(){}
        static final int InnerStaticInt = 0;
//        static final int staticFinalMethod(){}
    }

}

//protected class ProtectedClass{          //no protected is allowed
//private class PrivateClass{              //no private
//public class PublicClass{                //only 1 public
//static class StaticClass{}               //not allowed

class SubFileDefaultClass{
    private void privateMethod(){}
    protected void proctectedMethod(){}
    void defaultMethod(){}
    public void publicMethod(){}
    
    private class SubFileClassInnerClassPrivate{private void privateMethod(){}    protected void proctectedMethod(){}    void defaultMethod(){}    public void publicMethod(){}}
    public class SubFileClassInnerClassPublic{private void privateMethod(){}    protected void proctectedMethod(){}    void defaultMethod(){}    public void publicMethod(){}}
    protected class SubFileClassInnerClassProtected{private void privateMethod(){}    protected void proctectedMethod(){}    void defaultMethod(){}    public void publicMethod(){}}
    class SubFileClassInnerClassDefault{private void privateMethod(){}    protected void proctectedMethod(){}    void defaultMethod(){}    public void publicMethod(){}}
    static class SubFileClassInnerClassStatic{private void privateMethod(){}    protected void proctectedMethod(){}    void defaultMethod(){}    public void publicMethod(){}}
    
    public static void main(String[] args){
        System.out.println("sub-file main");
    }
}

class ChildFileClass extends TestingAccess_file1{
    public static void main(String[] args){
        ChildFileClass cfc = new ChildFileClass();
        cfc.defaultMethod();cfc.proctectedMethod();cfc.publicMethod();// no private
//        ChildFileClass. // no private
    }
}