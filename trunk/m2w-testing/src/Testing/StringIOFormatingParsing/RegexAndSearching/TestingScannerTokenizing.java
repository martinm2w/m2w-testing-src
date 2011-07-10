/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.StringIOFormatingParsing.RegexAndSearching;

import java.io.InputStream;
import java.util.Scanner;

/**
 * System.in wont work like this. don't know why
 * @author ruobo
 * @date Jul 4, 2011
 */
public class TestingScannerTokenizing {
    public static void main(String[] args){
        boolean b2, b;
        int i;
        String s, hits = " ";
//        System.out.println("input");
//        InputStream input = System.in; // use input: "1 true 34 hi"// program wont respont using this way
//        System.out.println("2 input: "); // nor this way
//        System.out.flush();
//        try{
            Scanner s1 = new Scanner("1 true 34 hi");//scanner constr can take a InputStream
    //        System.out.println("s2 input: ");
    //        System.out.flush();
            Scanner s2 = new Scanner("1 true 34 hi");
            while(b = s1.hasNext()){
                s = s1.next(); hits += "s";
            }

            while(b = s2.hasNext()){
                if(s2.hasNextInt()){//Returns true if the next token in this scanner's input can be interpreted as an int value in the default radix using the nextInt() method. The scanner does not advance past any input
                    i = s2.nextInt();//Scans the next token of the input as an int.
                    hits += "i";
                }else if(s2.hasNextBoolean()){
                    b2 = s2.nextBoolean(); hits += "b";
                }else{
                    s2.next();//public String next() . Finds and returns the next complete token from this scanner. A complete token is preceded and followed by input that matches the delimiter pattern. This method may block while waiting for input to scan, even if a previous invocation of hasNext() returned true.
                    hits += "s2";
                }
            }
//        }catch(Exception e){e.printStackTrace();}
        System.out.println("hits " + hits);
    }
}
