/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.Date_Number_Currency;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ruobo
 * @date Jul 2, 2011
 */
public class TestingCalender {
    public static void main(String[] args){
//        Calendar c = new Calendar();// abstract class illigal
        Calendar c = Calendar.getInstance();
        System.out.println(c.toString());
        c.set(2011, 06, 02);//month starts at 0
        Date a = c.getTime();
        System.out.println(c.getTime());
//        System.out.println(System.nanoTime());
//        System.out.println(c);//same as toString
        System.out.println("DATE: " + c.DATE);
        System.out.println("day of month: " + c.DAY_OF_MONTH  );
        System.out.println("AM_PM: " + c.AM_PM);
        System.out.println("HOUR_OF_DAY: " + c.HOUR_OF_DAY);
//        System.out.println("HOUR_OF_DAY: " + c.);
//        System.out.println("AM_PM: " + c.);

        //add
        System.out.println("testing adding");
        System.out.println("before: " + c.getTime());
        System.out.print(c.HOUR + "->"); c.add(Calendar.HOUR, 5); System.out.println(c.HOUR);
        System.out.print(c.DATE + "->"); c.add(Calendar.DATE, 1); System.out.println(c.DATE);
        System.out.println("after: " + c.getTime());
    }
}
