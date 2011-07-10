/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.Other;

/**
 *
 * @author ruobo
 * @date Jul 10, 2011
 */
public class TestingOverridingEqualsAndHashcodeMethods {
    public static void main(String[] args){
        TestingOverridingEqualsAndHashcodeMethods enh = new TestingOverridingEqualsAndHashcodeMethods();
        enh.simpleOverride();
    }
    
    private void simpleOverride(){
        SimpleOverrideClass s1 = new SimpleOverrideClass(17);
        SimpleOverrideClass s2 = new SimpleOverrideClass(18);
        
        System.out.println("equal? " + s1.equals(s2));
        System.out.println("s1.hashcode(): " + s1.hashCode());
        System.out.println("s2.hashcode(): " + s2.hashCode());
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        
        System.out.println(Integer.toHexString(1722));
        System.out.println(Integer.toHexString(1799));
        
        Integer a = Integer.parseInt("707", 16);
        System.out.println(a);
    }
    
}

    class SimpleOverrideClass{
        private int pcPrice;
        
        SimpleOverrideClass(int in){
            pcPrice = in;
        }
        
        public int getPcPrice(){
            return pcPrice;
        }
        
        
    @Override
        public boolean equals(Object o){
            if ((o instanceof SimpleOverrideClass) && ((SimpleOverrideClass)o).getPcPrice() == this.pcPrice){ //have to do the instance of check first
                return true;
            }else{
                return false;
            }
        }
//The equals method implements an equivalence relation on non-null object references:
//
//1.It is reflexive: for any non-null reference value x, x.equals(x) should return true.
//2.It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
//3.It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true.
//4.It is consistent: for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently return false, provided no information used in equals comparisons on the objects is modified.
//5.For any non-null reference value x, x.equals(null) should return false.
       
    
    @Override // generated
        public int hashCode() {
            int hash = 7;
            hash = 59 * hash + this.pcPrice*77;
            return hash;
        }
//    The general contract of hashCode is:
//
//Whenever it is invoked on the same object more than once during an execution of a Java application, the hashCode method must consistently return the same integer, 
//provided no information used in equals comparisons on the object is modified. This integer need not remain consistent from one execution of an application 
//to another execution of the same application.
//If two objects are equal according to the equals(Object) method, then calling the hashCode method on each of the two objects must produce the same integer result.
//It is not required that if two objects are unequal according to the equals(java.lang.Object) method, then calling the hashCode method on each of the two objects 
//must produce distinct integer results. However, the programmer should be aware that producing distinct integer results for unequal objects may improve the performance of hashtables.
    
    
    }
