/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._01_Declare_Access_Enum.Declare;

/**
 *
 * @author ruobo
 * @date Aug 7, 2011
 */
public class TestingInitAndOverloadedConstru {
    TestingInitAndOverloadedConstru(String s){
        System.out.println("oh ya");
    }
}

class TestingInitAndOverloadedConstru_1 extends TestingInitAndOverloadedConstru{
    TestingInitAndOverloadedConstru_1(){
        super("go");
    }
    TestingInitAndOverloadedConstru_1(String s ){
        this();
        System.out.println("this()");
    }

    {System.out.println("after super");}
    public static void main(String[] args){
        TestingInitAndOverloadedConstru_1 m2w = new TestingInitAndOverloadedConstru_1("oh");
    }
}
