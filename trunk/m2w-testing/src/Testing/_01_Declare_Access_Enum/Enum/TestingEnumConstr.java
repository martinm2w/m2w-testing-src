/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._01_Declare_Access_Enum.Enum;

/**
 * 1. enum keyword is lowercased.
 * 2. enum declaration is like class. Xxxx
 * 3. enum values declaration are like building new instances of the Name enum Obj.
 * 4. need to provide with constr in order to use value that takes an object/primitive.
 * 5. value declaration must come before the other things.
 * 6. values are public static final instances.
 * ----------------------7/26/11 11:24 PM----------------------------
 * 7. enum constr will run whenever enum class is referenced, before any following code.
 *    and all constr will run 1 by 1, according to how many values it has in the declaration.
 * 8. enum's var are instance vars. not static.
 * @author ruobo
 * @date Jul 23, 2011
 */
public class TestingEnumConstr {
    enum Name{
        a("martin"), b("yingying"),c(1);// newing instances.
        String name;
        int i;
        private int q = 0;
        Name(String s){this.name = s; System.out.println("string");}
        Name(int i){this.i = i; System.out.println("int");}
        String getName(){return this.name;}
//        String.valueOf(b);
//        Integer.v
    }

    public static void main(String[] args){
        System.out.println("line 1");
        System.out.println(Name.a.getName());
        System.out.println("line 3 q: " + Name.a.q);
    }
}
