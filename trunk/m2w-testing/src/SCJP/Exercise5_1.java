/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SCJP;

/**
 *
 * @author ruobo
 */
public class Exercise5_1 {
    public static void main(String[] args){
        for(char a = 1; a < 4; a++){
            System.out.println("a= " + Integer.valueOf(a));
            switch (a){
                //fall through
                case 1:     System.out.print("1 "); 
                            System.out.println("2 lines in one case without {}?  ---  yes");
                    
                default:    System.out.println("default");
                case 2:    { System.out.print("2 "); System.out.println("2 lines in one case without {}?"); }
            }
        }
    }
    
}
