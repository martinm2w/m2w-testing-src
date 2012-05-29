/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._01_Declare_Access_Enum.Declare;

/**
 * 1. abstract classes constructor works as like normal classes
 * 2. polymorphism works for declaring var as the super abs type.
 * 3. abs class cannot be instantiated.
 * @author ruobo
 * @date Jul 25, 2011
 */
public class TestingAbstractClassConstructor {
    public static void main(String[] args){
        $testing_Abs_Constr_child m2w = new $testing_Abs_Constr_child();
        $testing_Abs_Constr_super m2w1 = new $testing_Abs_Constr_child();
//        $testing_Abs_Constr_super m2w2 = new $testing_Abs_Constr_super();
    }

    private void $test1(){
        
    }
}

abstract class $testing_Abs_Constr_super{
    $testing_Abs_Constr_super(){
        System.out.println("super");
    }
}
class $testing_Abs_Constr_child extends $testing_Abs_Constr_super{
    
}

