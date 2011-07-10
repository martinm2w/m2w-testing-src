/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.GenericsAndCollections.Collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ruobo
 */
public class TestingListToStringMethod {
    
    public static void main(String[] args){
        
        List a = new ArrayList();
        a.add("a");
        a.add("a");
        a.add("a");
        a.add("a");
        
        String b = "";
        
        for(Object c : a){
            b += (String)c + " ";
        }
        
        
        System.out.println(b);
    }
    
}
