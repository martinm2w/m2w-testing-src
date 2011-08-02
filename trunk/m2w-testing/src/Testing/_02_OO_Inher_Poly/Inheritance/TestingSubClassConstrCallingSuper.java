package Testing._02_OO_Inher_Poly.Inheritance;

/**
 *
 * @author [Ruobo + m2w]
 * @date [Jul 27, 2011 - 12:53:58 PM]
 */
public class TestingSubClassConstrCallingSuper {
    
}

class $m2wTestingSubConstrCallingSuper_super{
    static String s = "super static s";
    String s2 = "super instance s2";
    $m2wTestingSubConstrCallingSuper_super(String arg){
        s += arg;
//        s2 = "constr";
    }
    static void go(){}
}

class $m2wTestingSubConstrCallingSuper_child extends $m2wTestingSubConstrCallingSuper_super{
    public $m2wTestingSubConstrCallingSuper_child(){
        super(s);
    }
////    @Override
    void come (){
        $m2wTestingSubConstrCallingSuper_child.go();
        s = "go";
    }
    
}