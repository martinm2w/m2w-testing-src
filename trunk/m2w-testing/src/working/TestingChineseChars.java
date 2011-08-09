package working;

/**
 *
 * @author [Ruobo + m2w]
 * @date [Aug 3, 2011 - 1:33:11 PM]
 */
public class TestingChineseChars {
    public static void main(String[] args){
        String s = "个人觉得其实最重要的是要乐观";
//        boolean b = s.matches("[\\u4E00-\\u9FA5]");
        StringBuilder ss = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            Character a = s.charAt(i);
            String temp = a.toString();
            if (temp.matches("[\\u4E00-\\u9FA5]"))
                ss.append(temp);
        }
        System.out.println(ss);
//        if (b) System.out.println("found!");
//        else System.out.println("fail");
    }
}
