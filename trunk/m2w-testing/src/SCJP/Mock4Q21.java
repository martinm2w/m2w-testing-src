/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SCJP;

/**
 *
 * @author ruobo
 * @date Aug 7, 2011
 */
public class Mock4Q21 {
    public static void main(String[] args){
        String a = "x1 23 y #";
        String[] b = a.split("\\w");
        System.out.println("length: " + b.length);

        for(String x : b)
            System.out.println(">"+x+"<");


        for(;;){
            if(true)continue;
//            System.out.println();
        }
    }
}
