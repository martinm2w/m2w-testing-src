package Testing._03_Assignments.WapperAndBoxing;

/**
 *
 * @author [Ruobo + m2w]
 * @date [Aug 2, 2011 - 1:42:27 PM]
 */
public class TestingWrappersImmutable {
    public static void main(String[] args){
        $test1();
    }
    private static void $test1(){
        Integer i = 1;
        Integer b = 1;
        Integer c = i.intValue();
        System.out.println(i == b);
        System.out.println(i == c);
    }
}
