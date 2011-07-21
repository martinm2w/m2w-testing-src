/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._02_OO_Inher_Poly.Inheritance;

/**
 *
 * @author ruobo
 */
public class TestDrive {

    public static void main(String[] args){

        Child_1 C1 = new Child_1();
        SuperClass S1 = new Child_1();

        C1.print();
        C1.printC1();

        S1.print();

        OChild OC = new OChild();
        Object O = new OChild();

        System.out.println(OC.toString());
        System.out.println(O.toString());

        
    }

}
