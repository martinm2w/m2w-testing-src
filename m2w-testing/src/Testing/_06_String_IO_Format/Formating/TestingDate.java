/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._06_String_IO_Format.Formating;

import java.util.*;
/**
 *
 * @author ruobo
 * @date Jul 2, 2011
 */
public class TestingDate {
    public static void main(String[] args){
        Date d = new Date(1000000000000l);
        System.out.println("date of d is: " + d);
        d.setTime(d.getTime() + 3600000);
        System.out.println("an hour later: " + d);
    }
}
