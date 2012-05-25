/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SCJP.exc;

//import Testing.StringIOFormatingParsing.RegexAndSearching.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author ruobo
 */
public class Chp6Q1 {
    
    public static void main(String[] args){
        Chp6Q1 exc = new Chp6Q1();
        exc.scjpChp6_exc1();
    }
    
    private void scjpChp6_exc1(){
        Pattern p = Pattern.compile("\\d*");
        Matcher m = p.matcher("ab34ef");
        boolean b = false;

        while(b = m.find()){
            System.out.print(m.start() + m.group());//group returns empty strings each find, because 0 or more digits \\d*.
            //testing:
            System.out.println();
//            System.out.println(" count:  " +  m.groupCount());
        }
        

    }
}
