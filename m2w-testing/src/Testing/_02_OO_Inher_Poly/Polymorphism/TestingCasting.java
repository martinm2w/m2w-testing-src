/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._02_OO_Inher_Poly.Polymorphism;

import java.util.*;
import javax.management.relation.RoleList;
/**
 *
 * @author ruobo
 * @date Jul 24, 2011
 */
public class TestingCasting {

    public static void main(String[] args){
        TestingCasting m2w = new TestingCasting();
        m2w.$test1();
    }

    private void $test1(){
        List a = new ArrayList();
        RoleList b = (RoleList)a;
    }
}