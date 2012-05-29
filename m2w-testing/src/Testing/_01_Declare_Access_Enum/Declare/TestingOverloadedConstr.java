package Testing._01_Declare_Access_Enum.Declare;

/**
 * 1. call to this() must be first statement of overloaded constr
 * @author [Ruobo + m2w]
 * @author [Jul 26, 2011 - 12:02:07 PM]
 */
public class TestingOverloadedConstr {
    TestingOverloadedConstr(){System.out.println(a);}
    TestingOverloadedConstr(int i){
        System.out.println(a);
//        this()
    }
    int a = 0;
    static int b = 1;
}
