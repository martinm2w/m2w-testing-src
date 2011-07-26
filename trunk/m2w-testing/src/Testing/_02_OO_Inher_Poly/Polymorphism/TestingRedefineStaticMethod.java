package Testing._02_OO_Inher_Poly.Polymorphism;

/**
 * 1. static method can only be redefined and not overriden.
 * @author [Ruobo + m2w]
 * @author [Jul 26, 2011 - 12:21:02 PM]
 */
public class TestingRedefineStaticMethod {
    
}
class $A_m2w_Redf_static{
    static void go(){}
}
class $A_m2w_Redf_static_child extends $A_m2w_Redf_static{
//    @Override
    static void go(){
        System.out.println();
        return;
    }
}