/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._00_Other;

/**
 * 1. enum keyword is lowercased.
 * 2. enum declaration is like class. Xxxx
 * 3. enum values declaration are like building new instances of the Name enum Obj.
 * 4. need to provide with constr in order to use value that takes an object/primitive.
 * 5. value declaration must come before the other things.
 * 6. values are public static final instances.
 * @author ruobo
 * @date Jul 23, 2011
 */
public class TestingEnumConstr {
    enum Name{
        a("martin"), b("yingying"),c(1);// newing instances.
        String name;
        int i;
        Name(String s){this.name = s;}
        Name(int i){this.i = i;}
        String getName(){return this.name;}
//        String.valueOf(b);
//        Integer.v
    }

    public static void main(String[] args){
        System.out.println(Name.a.getName());
    }
}
