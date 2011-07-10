/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SCJP;

/**
 *
 * @author ruobo
 */
public class Chp6Q3 {
    public static void main(String[] args){
        Chp6Q3 exc = new Chp6Q3();
        exc.chp6q3();
    }
    
    private void chp6q3 (){
        String s = "-";
        Integer x = 343;
        long L343 = 343L;
        if(x.equals(L343))  s += ".e1";//wrapper equals only returns when two primitive types and two values are equal.
        if(x.equals(343))  s += ".e2";
        Short s1 = (short)((new Short((short)343)) /  (new Short((short)49)));//byte range is -2^7 to 2^7 - 1 (-128 to 127) short is 2^15, 32768 - 1
        if(s1 == 7) s += "=s";
        if(s1 < new Integer(7+1)) s += "fly ";
        System.out.println(s);
    }
}
