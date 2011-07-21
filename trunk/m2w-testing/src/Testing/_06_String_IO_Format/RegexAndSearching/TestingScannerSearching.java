/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._06_String_IO_Format.RegexAndSearching;

import java.util.Scanner;

/**
 *
 * @author ruobo
 * @date Jul 3, 2011
 */
public class TestingScannerSearching {
    public static void main(String[] args){
        System.out.println("input: ");
        System.out.flush();//Flushes the stream. This is done by writing any buffered output bytes to the underlying output stream and then flushing that stream.
        try{
            Scanner s = new Scanner(System.in);//
            String token;
            do{
                token = s.findInLine("\\d\\d");
                System.out.println("found: " + token);
            }while(token != null);
        }catch(Exception e){e.printStackTrace(); System.out.println("scan exc");}
        
    }
}
