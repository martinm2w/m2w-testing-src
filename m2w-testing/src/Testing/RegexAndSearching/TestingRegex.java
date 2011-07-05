/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.RegexAndSearching;

import java.util.regex.*;
/**
 *
 * @author ruobo
 * @date Jul 2, 2011
 */
public class TestingRegex {
    public static void main(String[] args){
        TestingRegex tr = new TestingRegex();
        tr.scjpChp6_exc1();
    }

    private void scjpChp6_text(){
        Pattern p = Pattern.compile("\\d\\w");
        Matcher m = p.matcher("ab4 56_7ab");
        System.out.println("Pattern is: " + m.pattern());
        while(m.find()){
//       Find:     Attempts to find the next subsequence of the input sequence that matches the pattern.
//            This method starts at the beginning of this matcher's region,
//            or, if a previous invocation of the method was successful and the matcher has not since been reset, at the first character not matched by the previous match.
//            If the match succeeds then more information can be obtained via the start, end, and group methods.
            System.out.println("start: " + m.start() + ", ends: " + m.end() + ", " + m.group());
            //For a matcher m with input sequence s,
            //the expressions m.group() and s.substring(m.start(), m.end()) are equivalent.
        }

        //testing zero-length match
        Pattern p1 = Pattern.compile("a?");
        Matcher m1 = p1.matcher("baba");//aba and baba
        System.out.println("Pattern is: " + m1.pattern());
        while(m1.find()){
            System.out.println(m1.start() + " " + m1.end() + " " + m1.group());
            //For a matcher m with input sequence s,
            //the expressions m.group() and s.substring(m.start(), m.end()) are equivalent.
        }
    }

    private void scjpChp6_exc1(){
        Pattern p = Pattern.compile("\\d*");
        Matcher m = p.matcher("ab34ef");
        boolean b = false;

        while(b = m.find()){
            System.out.print(m.start() + m.group());
            //testing:
            System.out.println();
//            System.out.println(" count:  " +  m.groupCount());
        }
        

    }
}
