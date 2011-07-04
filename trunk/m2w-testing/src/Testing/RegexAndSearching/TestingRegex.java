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
        Pattern p = Pattern.compile("\\d\\w");
        Matcher m = p.matcher("ab4 56_7ab");
        System.out.println("Pattern is: " + m.pattern());
        while(m.find()){
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
}
