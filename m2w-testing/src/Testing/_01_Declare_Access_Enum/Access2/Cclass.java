/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package Testing._01_Declare_Access_Enum.Access2;


import Testing._01_Declare_Access_Enum.Access.*;
/**
 *
 * @author ruobo
 */
public class Cclass {

    public static void main(String[] args){

        Aclass A = new Aclass();
        A.checkStaticIt();
        A.checkIt();
        Aclass.checkStaticIt();
        A.checkIt();

    }
}
