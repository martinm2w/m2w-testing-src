/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._07_Generics_Collections.CompareAndSearch;

/**
 *
 * @author ruobo
 * @date Jul 25, 2011
 */
public class TestingComparing {
    public static void main(String[] args){
        $m2w_testingComparing m2w1 = new $m2w_testingComparing();
        $m2w_testingComparing m2w2 = new $m2w_testingComparing();
        $m2w_testingComparing_Overridden m2w3 = new $m2w_testingComparing_Overridden();
        $m2w_testingComparing_Overridden m2w4 = new $m2w_testingComparing_Overridden();
        System.out.println(m2w1.equals(m2w2));
        System.out.println(m2w1 + " ---- toString() ---- " + m2w2);
        System.out.println(m2w1.hashCode() + " ---- hashCode() ---- " + m2w2.hashCode());
        System.out.println(m2w1 == m2w2);
        System.out.println("---------------------------------");
        System.out.println(m2w3.equals(m2w4));
        System.out.println(m2w3 + " ---- toString() ---- " + m2w4);
        System.out.println(m2w3.hashCode() + " ---- hashCode() ---- " + m2w4.hashCode());
        System.out.println(m2w3 == m2w4);
        System.out.println("---------------------------------");
        
        System.out.println();
        System.out.println();
        String a = "come here";
        String b = "come here";
        System.out.println(a.equals(b));
        System.out.println(a + " ---- toString() ---- " + b);
        System.out.println(a.hashCode() + " ---- hashCode() ---- " + b.hashCode());
        System.out.println(a == b);
        String c = new String("come here");
        String d = new String("come here");
        System.out.println(c.equals(d));
        System.out.println(c + " ---- toString() ---- " + d);
        System.out.println(c.hashCode() + " ---- hashCode() ---- " + d.hashCode());
        System.out.println(c == d);
    }
    
}

class $m2w_testingComparing{}
class $m2w_testingComparing_Overridden{

    @Override
    public boolean equals(Object obj){
        return true;
    }
    
    @Override
    public int hashCode(){
        return 1;
    }
}

class $m2w_testingComparing_Overridden_OnlyEquals{

    @Override
    public boolean equals(Object obj){
        return true;
    }
    
//    @Override
//    public int hashCode(){
//        return 1;
//    }
}