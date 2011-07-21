/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._03_Assignments.WapperAndBoxing;

/**
 *
 * @author ruobo
 * @date Jul 10, 2011
 */
public class TestingInteger {
    public static void main(String[]args){
        TestingInteger ti = new TestingInteger();
        ti.testing1();
    }
    
    private void testing1(){
        System.out.println(Integer.toHexString(1722));
        System.out.println(Integer.toHexString(1799));
        
        Integer a = Integer.parseInt("707", 16);
        Integer b = Integer.parseInt("6ba", 16);
        System.out.println(a);
        System.out.println(b);
    }
}
