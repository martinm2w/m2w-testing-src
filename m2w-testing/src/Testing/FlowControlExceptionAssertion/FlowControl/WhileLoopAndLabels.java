/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.FlowControlExceptionAssertion.FlowControl;

/**
 *
 * @author ruobo
 * @date Jun 16, 2011
 */
public class WhileLoopAndLabels {
//	====================================Attributes=============================================

//      ===================================init & const============================================

//	====================================main method============================================
    public static void main (String[] args){
        
        System.out.println("1. Testing Labeled While loop");
        
        
        outer:
        for(int i = 0; i < 3; i++){
            System.out.println("i: " + i);
            int age =11;
            inner:
//            int age =11;//can't put anything between label and loop declaration.
            while(age <= 21){
                age++;
                System.out.print("age: " + age + ". ");
                if(age == 16){
                    System.out.println("get your driver's license");
                    continue outer;
                }
                System.out.println("another year");

            }
        }
    }
//	===================================util methods============================================

//      =================================setters & getters=========================================
}
