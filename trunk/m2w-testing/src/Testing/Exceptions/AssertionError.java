/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.Exceptions;

/**
 *
 * @author ruobo
 * @date Jun 20, 2011
 */
public class AssertionError {
    public static void main(String[] args){
        AssertionError ae = new AssertionError();
        ae.doStuff("o");
        ae.doStuff("fail");// just passes the assert because java has it off by default.
    }

    private void doStuff(String str){
        assert (str.equals("fail")): "fail" ;
        System.out.println(true);
    }
}
