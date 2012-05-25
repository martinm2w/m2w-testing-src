/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SCJP.exc;

import java.io.File;

/**
 *
 * @author ruobo
 */
public class Chp6Q5 {
    public static void main(){
        Chp6Q5 exc = new Chp6Q5();
//        exc
    }
    
    private void chp6q5(){
        try{
            File dir = new File("/home/ruobo/Desktop/dir3");
            dir.mkdir();
            File file = new File(dir, "file3");//also can ("dir3", "file3")
            file.createNewFile();
        }catch(Exception e){}
    }
}
