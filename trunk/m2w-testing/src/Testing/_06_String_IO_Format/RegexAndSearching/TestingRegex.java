/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._06_String_IO_Format.RegexAndSearching;

import java.util.regex.*;
/**
 * 1. so regex "." stands for everything.
 * 2. regex "\w" look for words. not tested chinese.
 * @author ruobo
 * @date Jul 2, 2011
 */
public class TestingRegex {
    public static void main(String[] args){
        TestingRegex tr = new TestingRegex();
//        tr.scjpChp6_exc1();
//        tr.testingParseSynsetInScil0200();
//        tr.$test1_dot();
        tr.$test2_w();
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
//            m.h
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
    
    private void testingParseSynsetInScil0200(){
        Pattern p = Pattern.compile("n.[\\w+.]* [a-zA-Z]?[^a-zA-Z]+");
        Matcher m = p.matcher("n.vi.vt. U出价,提议,意图,报价vt. 提供,出价,奉献,企图,使出现,演出vi. 出现,献祭n. 教皇,主教,高僧的地位vi. 装模作样的说话,执行教皇职务");
//                    Scanner s = new Scanner(subSynset).useDelimiter("n. [^a-z]");
        while(m.find()){
            String temp = m.group();
            System.out.println(temp);
            String words = temp.split(" ")[1];
            String[] senses = words.split(",", -1);
                for(String a : senses){
                    System.out.println("a" + a);
                }
        }
    }
    
    //7/22/11 1:18 PM
    private void $test1_dot(){
        Pattern p = Pattern.compile(".");
        Matcher m = p.matcher("Csdlf ja1 2312@#$ @#$@%@#!&*() ");
                
        while(m.find())
            System.out.print(m.group() + " ");
    }

    private void $test2_w(){
        String s = "adsfk jash dflkjhalk fj*&(^&*% ^&^$ %&^%&*6  ";
        Pattern p = Pattern.compile("\\w");
        Matcher m = p.matcher(s);

        while(m.find())
            System.out.print(m.end() + " " + m.group() + " | ");
        System.out.println();
        System.out.println(s.length());
    }
}
