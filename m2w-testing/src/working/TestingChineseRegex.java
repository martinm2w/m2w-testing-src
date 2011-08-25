package working;

/**
 *
 * @author [Ruobo + m2w]
 * @date [Aug 24, 2011 - 11:18:58 AM]
 */
public class TestingChineseRegex {
    public static void main(String[] args){
//        $test1();
        $test2();
    }
    
    private static void $test1 (){
        String a = "我说的不对吗你说呢nasdflkjas";
        boolean b = a.matches("[\\u4E00-\\u9FA5]*不[\\u4E00-\\u9FA5]?吗[\\u4E00-\\u9FA5]*");
        boolean c = a.matches(".*不[\\u4E00-\\u9FA5]?吗.*");
        System.out.println(b);
        System.out.println(c);
    }
    private static void $test2(){
        String a = "阿德里封口机 不是 我 就是 他阿斯顿离开房间 ";
        boolean b = a.matches(".*不是.*就是.*");
        System.out.println(b);
    }
}
