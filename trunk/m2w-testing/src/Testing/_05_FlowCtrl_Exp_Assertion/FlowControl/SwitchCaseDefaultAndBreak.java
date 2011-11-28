/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._05_FlowCtrl_Exp_Assertion.FlowControl;

/**
 *
 * @author ruobo
 * @date Jun 16, 2011
 */
public class SwitchCaseDefaultAndBreak {
//	====================================Attributes=============================================

//      ===================================init & const============================================

//	====================================main method============================================
    public static void main(String[] args){
            final int a = 1;
    //        final int b;
    //        b = 2;
            int x = 5;
            switch(x){
                case a: System.out.println("case a");
    //            case b://constant expression required .. compile error
                case 3: // is a compile time constant.
                    System.out.println("case 3");
                    System.out.println("2nd line in case 3");
    //                 To be a variable that is a compile time constant, the variable needs to be...
    //                    1.declared as final
    //                    2.have a primative or String type
    //                    3.initialized (on the same line as the declaration)
    //                    4.assigned to a compile time constant expression
                default: System.out.println("default, if no break will continue");
                case 4:{System.out.println("case 4");};//can omit {} and ;
            }
//            String derp = "s";
//            switch(derp){
//                
//            }
    }
//	===================================util methods============================================

//      =================================setters & getters=========================================
}
