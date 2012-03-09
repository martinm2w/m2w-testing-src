package Testing._06_String_IO_Format.String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author [Ruobo + m2w]
 * @date [Jul 29, 2011 - 10:43:21 AM]
 */
public class TestingStringadfasdf {
    public static void main(String[] args){
        StringBuilder A = new StringBuilder("I think that \"i think\" works");
        Pattern p = Pattern.compile("I think|i think");
        Matcher m = p.matcher(A);
//        m.replaceAll("[i think]");
        while(m.find()){
            String temp = m.group();
            System.out.println(temp + "s: " + m.start() + " e: " + m.end());
            A.replace(m.start(), m.end(), "<tag>" + temp + "</tag>");
//            A.insert(m.start(), "<tag>");
//            A.insert(m.end(), "</tag>");
//            m.reset();
//            m = p.matcher(A) ;
////            m.re
//            m.group();
        }
        System.out.println(A);
        String a = "asdlfkjalfj";
        int b = a.length();
    }
    
//    private void $test1(){
//         Pattern p = Pattern.compile("I think|i think");
//         StringBuilder A = new StringBuilder("I think that \"i think\" works");
//        Scanner s = new Scanner(A).useDelimiter(p);
//        while(s.hasNext()){
//            
//        }
//    }
}
