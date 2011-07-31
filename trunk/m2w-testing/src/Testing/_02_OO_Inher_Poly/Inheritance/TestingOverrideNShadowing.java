/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._02_OO_Inher_Poly.Inheritance;

/**
 * 
 * @author ruobo
 * @date Jul 30, 2011
 */
public class TestingOverrideNShadowing {
    
}

class $testingOverrideNShadowSuper{
    static void go(){
        System.out.println("super");
    }
    static int i = 1;
}

class $testingOverrideNShadowSub extends $testingOverrideNShadowSuper{
    static void go(){
        System.out.println("sub");
    }
    static int i = 2;
    public static void main(String[] args){
        $testingOverrideNShadowSuper superm2w = new $testingOverrideNShadowSuper();
        System.out.println(superm2w.i);
        superm2w.go();
    }
}