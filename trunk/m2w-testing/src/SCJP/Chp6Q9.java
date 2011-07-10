/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SCJP;

import java.io.*;
        
/**
 *
 * @author ruobo
 */
public class Chp6Q9 {
    public static void main(String[] args){
        Chp6Q9 exc = new Chp6Q9();
        exc.chp6q9();
    }
    
    private void chp6q9(){
        String s;
        try{
            FileReader fr = new FileReader("/home/ruobo/Desktop/myFile");
            BufferedReader br = new BufferedReader(fr);
            while((s = br.readLine()) != null)//have to put double ()
                System.out.println(s);
//            br.flush();//no flush for reading. compile error.
        }catch(Exception e){System.out.println("io error");}
    }
}
