/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._02_OO_Inher_Poly;

import java.util.*;
import static Testing.util.SOP.*;
/**
 *
 * @author ruobo
 * @date Jul 19, 2011
 */
public class TestingReferencesAndGC {
    public static void main(String[] args){
        TestingReferencesAndGC m2w = new TestingReferencesAndGC();
//        m2w.test1();
        m2w.test2();
    }

    private void test1(){
        List<String> a = new ArrayList<String>();
        List b = a;

        sop(a);
        sop(b);
        
        a.add("a");a.add("b");a.add("c");a.add("d");
        sop("added");
        
        sop(a);
        sop(b);

        a = null;

        sop("a=null");
//        sop(a);
        sop(b);

//        A AA = new A();
//        AA.aa = b;
    }

    private void test2(){
        Lost e1 = new Lost();
        Lost e2 = new Lost();
        Lost e3 = new Lost();
        e3.e = e2;
        e1.e = e3;
        e2.e = e1;
        sop("e1 " + e1);sop("e2 " + e2);sop("e3 " + e3);
        sop("e1.e " + e1.e);sop("e2.e " + e2.e);sop("e3.e " + e3.e);
        e3 = null;
        e2 = null;
        e1 = null;// at this moment , all 3 objects are elegi for GC, cuz 3 objs are internally refered to each other via instance vars.

    }
}

class Lost {
    Lost e;
}