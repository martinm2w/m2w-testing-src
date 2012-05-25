/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SCJP.exc;
//import java.lang.*;

import java.lang.Exception;


/**
 *
 * @author ruobo
 */
public class Exercise5_3 {

    public static void main(String[] args){
        Exercise5_3 e = new Exercise5_3();
        try{
            e.reverse("");
        }catch (Exception a){
            a.printStackTrace();
            System.out.println("s = empty");
        }
        finally{
            System.out.println("finished");
        }
    }
    private Exception Exception;


    String reverse(String s) throws Exception{//more specific type the better
        String reverseStr = "";
        
        if(s.length() == 0){
            throw Exception;
        }


        for(int i = s.length()-1; i >=0; --i){
            reverseStr += s.charAt(i);
        }
        
        return reverseStr;
    }
}
