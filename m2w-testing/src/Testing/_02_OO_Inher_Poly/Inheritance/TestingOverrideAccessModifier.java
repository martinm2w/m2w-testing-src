/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._02_OO_Inher_Poly.Inheritance;

/**
 * 1. Overriding method can be final. 
 * 2. private methods cannot be overrided because they are not inherited.
 * 3. Overriding method can have less restrictive Access Modifiers.
 * 4. overriding method can't be static. or not static(change)
 * @author ruobo
 * @date Jul 21, 2011
 */
public class TestingOverrideAccessModifier extends Thread{
    @Override
//    public void run(){} // all good
//    void run(){} // not good
    final public void run(){}// good !
//    static public void run(){}//
}

class OverridingRestrictive{
    void go(){}
}

class OverridingLessRestrictive extends OverridingRestrictive{
    @Override
//    protected void go(){} // ok 
    
//    public void go(){}//ok
    void go(){}//ok
//    static void go()//fails
}