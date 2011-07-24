/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._03_Assignments.WapperAndBoxing;

/**
 *
 * @author ruobo
 * @date Jul 23, 2011
 */
public class TestingAutoBoxingIntToNumber {
    public static void main(String[] args){
        TestingAutoBoxingIntToNumber m2w = new TestingAutoBoxingIntToNumber();
        m2w.test1();
    }

    private void test1(){
        Number a;
        int i = 1;
        a = i;
        System.out.println("a : " + a);
    }
}
