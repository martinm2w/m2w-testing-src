/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.StringIOFormatingParsing.Formating;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ruobo
 * @date Jul 2, 2011
 */
public class TestingCalendar {//it's calendar not calender
    public static void main(String[] args){
        TestingCalendar tc = new TestingCalendar();
//        tc.selfTesting();
        tc.increasingAMonth();
    }



    private void selfTesting(){
        //        Calendar c = new Calendar();// abstract class illigal
        Calendar c = Calendar.getInstance();
        System.out.println(c.toString());
        c.set(2011, 06, 02, 13, 14, 15);//month starts at 0
        
        Date a = c.getTime();
        System.out.println(c.getTime());
//        System.out.println(System.nanoTime());
//        System.out.println(c);//same as toString
        System.out.println("DATE: " + c.get(Calendar.DATE));// fail observing using c.HOUR.
        System.out.println("day of month: " + c.get(Calendar.DAY_OF_MONTH) );// fail observing using c.HOUR.
        System.out.println("AM_PM: " + c.get(Calendar.AM_PM));// fail observing using c.HOUR.
        System.out.println("HOUR_OF_DAY: " + c.get(Calendar.HOUR_OF_DAY));// fail observing using c.HOUR.
//        System.out.println("HOUR_OF_DAY: " + c.);
//        System.out.println("AM_PM: " + c.);

        //add
        System.out.println("testing adding");
        System.out.println("before: " + c.getTime());
        System.out.print(c.get(Calendar.HOUR) + "->"); c.add(Calendar.HOUR, 5); System.out.println(c.get(Calendar.HOUR));// fail observing using c.HOUR.
        System.out.print(c.get(Calendar.DATE) + "->"); c.add(Calendar.DATE, 1); System.out.println(c.get(Calendar.DATE));// fail observing using c.HOUR.
        System.out.println("after 1 day and 5 hours: " + c.getTime());
    }

    private void increasingAMonth(){
        Date d1 = new Date(1000000000000l);
        System.out.println("1st date: " + d1.toString());

        Calendar c = Calendar.getInstance();
        c.setTime(d1);

        if(Calendar.SUNDAY == c.getFirstDayOfWeek())
            System.out.println("Sunday is the first day of the week");
        System.out.println("trillionth milli day of week is: " + c.get(Calendar.DAY_OF_WEEK));

        c.add(Calendar.MONTH, 1);
        Date d2 = c.getTime();
        System.out.println("new date: " + d2.toString());
    }

}
