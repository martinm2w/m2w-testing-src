/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SCJP.exc;

import java.util.*;

/**
 *
 * @author ruobo
 */
public class Chp6Q15 {
    public static void main(String[] args) {
        Chp6Q15 exc = new Chp6Q15();
        exc.right();
//        exc.wrong();
    }
    
    private void wrong(){
        String input = "1 2 a 3 45 6";
        Scanner sc = new Scanner(input);
        int x = 0;
        do{
            x = sc.nextInt();
            System.out.println(x + " ");
        }while(x!=0);// the nextXxx() methods are typically invoked after a call to a hasNextXxx(),
    }
    
    private void right(){
        String input = "1 2 a 3 45 6";
        Scanner sc = new Scanner(input);
        int x = 0;
        do{
            if(sc.hasNextInt()){
                x = sc.nextInt();
                System.out.println(x + " ");
            }else if(sc.hasNext()){// have to include hasnext check before doing next.
                sc.next();
            }
        }while(x!=0); //Returns true if the next token in this scanner's input can be interpreted as an int value in the default radix using the nextInt() method. The scanner does not advance past any input.
    }
}
