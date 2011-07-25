/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._02_OO_Inher_Poly.Interface_Abstract;

/**
 * 1. inner interface can be protected, public, and static.
 * 2. outer interface can only be non-Access modifier. and can not be static, like classes.
 * 3. things in interfaces are public by default.
 * @author ruobo
 * @date Jul 25, 2011
 */
public interface TestingInterfaceDeclaration {
//    public static void main(String[] args){
//        
//    }
    
//    protected interface $m2w_TestingInterfaceDeclaration_protected_Inner{}// in class yes
//    protected static interface $m2w_TestingInterfaceDeclaration_protected_Inner_static{}// in class yes
    public interface $m2w_TestingInterfaceDeclaration_public_Inner{}// in class or interface yes
    public static interface $m2w_TestingInterfaceDeclaration_public_Inner_static{}
//    private interface $m2w_TestingInterfaceDeclaration_private_Inner{}// in class or interface yes
//    default interface $m2w_TestingInterfaceDeclaration_default_Inner{} // no!
    
//    static void go();
}

    interface $m2w_TestingInterfaceDeclaration_NoAccess{}
//    static interface $m2w_TestingInterfaceDeclaration_NoAccess_static{}
//    protected static interface $m2w_TestingInterfaceDeclaration_protected_static{}
//    public interface $m2w_TestingInterfaceDeclaration_public_Inner{}
//    public static interface $m2w_TestingInterfaceDeclaration_public_Inner_static{}
