/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._01_Declare_Access.Declare;

/**
 * 1. abs method must be declared as so. interface method don't have to.
 * 2. interface method cannot have body.
 * 3. method can not be abstract and private.
 * 4. interface cannot implements an interface.
 * 5. abs class cannot extends interface.
 * 6. only interfaces can be implemented.
 * @author ruobo
 * @date Jul 23, 2011
 */
public class TestingAbstractNInterfaceDuty {
    
}

interface A_testInDuty{void a(); int i = 0;}
abstract class A_testAbsDuty{abstract void b(); void bb(){} private void bb_(){} private int i;}
abstract class A_testAbsDute1 implements A_testInDuty{}
abstract class A_testAbsDute2 extends A_testAbsDuty{}
//abstract class A_testAbsDute2 extends A_testInDuty{}
interface A_testInDutyChild extends A_testInDuty{}
//interface A_testInDutyChild1 extends A_testAbsDute1{}
//interface A_testInDutyChild1 implements A_testInDuty{}//wrong.