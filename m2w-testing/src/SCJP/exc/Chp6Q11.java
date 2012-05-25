/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SCJP.exc;

import java.io.Console;

/**
 * m2w: tested in command line.
 * @author ruobo
 */
public class Chp6Q11 {
    public static void main(String[] args){
        Chp6Q11 exc = new Chp6Q11();
        exc.chp6q11();
    }
    
    private void chp6q11(){
        Console c = System.console();
        String u = c.readLine("%s", "username: ");
        System.out.println("hello " + u);
        char[] pw;
        if((c != null) && ((pw = c.readPassword("%s", "password: ")) != null)){
        
        // readPassword returns a char[]
            //check for valid password
        }
    }
}
