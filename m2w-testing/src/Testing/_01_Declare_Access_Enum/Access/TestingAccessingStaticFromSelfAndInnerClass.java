package Testing._01_Declare_Access_Enum.Access;

/**
 * 
 * @author [Ruobo + m2w]
 * @author [Aug 5, 2011 - 11:11:03 AM]
 */
public class TestingAccessingStaticFromSelfAndInnerClass {
    private int x = 2;
    protected int y =3;
    private static int m1 = 4;
    protected static int m2 = 5;
    public static int t1 = 0;
    public static void main(String[] args){
        
    }
    static void  $test2(){
        System.out.println("2");
    }
    
    TestingAccessingStaticFromSelfAndInnerClass(String s){
        System.out.println("super" + s);
        }
    private void $test1(){
        int m3 = m1;
        int m4 = m2;
    }
    class inner$testing{
        
    }
}

class $testing_TestingAccessingStaticFromSelfAndInnerClass extends TestingAccessingStaticFromSelfAndInnerClass{
    $testing_TestingAccessingStaticFromSelfAndInnerClass(){
        super("go"); 
//        this("go");//constructor are not inheritaed
        
    }
    public void $test3(){
        //private method are not inheritade
        System.out.println(t1);
        System.out.println($testing_TestingAccessingStaticFromSelfAndInnerClass.t1);
        int c =this.y;
        int b = t1;
        $test2();
        $testing_TestingAccessingStaticFromSelfAndInnerClass.$test2();
        
        
//        this.  // static var are not inherited
    }
}
