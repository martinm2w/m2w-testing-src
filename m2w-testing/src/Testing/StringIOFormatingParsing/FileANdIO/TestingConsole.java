/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.StringIOFormatingParsing.FileANdIO;

import java.io.Console;
/**
 *
 * @author ruobo
 * @date Jul 4, 2011
 */
public class TestingConsole {
    public static void main(String[] args){
        TestingConsole tc = new TestingConsole();
        tc.scjpChp6_458();
    }

    private void scjpChp6_458(){
        Console c = System.console();
        char[] pw;
        pw = c.readPassword("%s","pw: ");
        for(char ch : pw)
            c.format("%c", ch);
        c.format("\n");

        MyUtility mu = new MyUtility();
        while(true) {
            String name = c.readLine("%s", "input?: ");
            c.format("output: %s \n", mu.doStuff(name));
        }
    }
}

class MyUtility{
    String doStuff(String arg1){
        return "result is " + arg1;
    }
}
