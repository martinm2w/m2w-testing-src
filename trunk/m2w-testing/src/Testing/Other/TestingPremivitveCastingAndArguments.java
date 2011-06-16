/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.Other;

/**
 *
 * @author ruobo
 */
public class TestingPremivitveCastingAndArguments {

    public static void main(String[] args){
        System.out.println(new testing().doTesting(Short.parseShort("7")));
//        System.out.println(new testing().doTesting(7)); // needed to cast short to int
    }

}

class testing{
//    String do(short a){return "do - a ";}// can't use do as method name
    String doTesting(short a){
        return "a";
    }
}