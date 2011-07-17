/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.Assignments.WapperAndBoxing;

/**
 *
 * @Author ruobo
 * @Date Mar 8, 2011
 */
public class TestingWappers {

//	====================================Attributes=============================================
    Integer i = 3;
    int j;
//	====================================main method=============================================
    public static void main (String[] args){
        TestingWappers t = new TestingWappers();
        t.go();
    }

        
//	===================================util methods============================================
    public void go(){
        j=i;
        System.out.println(j);
        System.out.println(i);
    }
//      =================================setters & getters=========================================


}
