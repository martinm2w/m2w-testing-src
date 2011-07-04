/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.Date_Number_Currency;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ruobo
 * @date Jul 4, 2011
 */
public class TestingLocale {
    public static void main(String[] args){
        TestingLocale tl = new TestingLocale();
//        tl.scjpChp6_483();
        tl.scjpChp6_484();
    }

    /**
     * testing outputs and usage
     * @date 7/4/11 1:13 PM
     */
    private void scjpChp6_483(){
        Calendar c = Calendar.getInstance();
        c.set(2010, 11, 14);//2010 dec 14 month is 0-based

        Date d2 = c.getTime();

        Locale locIT = new Locale("it", "IT"); // Italy
        Locale locPT = new Locale("pt");       // Protugal
        Locale locBR = new Locale("pt", "BR"); // Brazil
        Locale locIN = new Locale("hi", "IN"); // India
        Locale locJA = new Locale("ja");       // Japan

        DateFormat dfUS = DateFormat.getInstance();
        System.out.println("US      " + dfUS.format(d2));

        DateFormat dfUSfull = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("US full " + dfUSfull.format(d2));

        DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
        System.out.println("Italy   " + dfIT.format(d2));

        DateFormat dfPT = DateFormat.getDateInstance(DateFormat.FULL, locPT);
        System.out.println("Protugal" + dfPT.format(d2));

        DateFormat dfBR = DateFormat.getDateInstance(DateFormat.FULL, locBR);
        System.out.println("Brazil  " + dfBR.format(d2));

        DateFormat dfIN = DateFormat.getDateInstance(DateFormat.FULL, locIN);
        System.out.println("India   " + dfIN.format(d2));

        DateFormat dfJA = DateFormat.getDateInstance(DateFormat.FULL, locJA);
        System.out.println("Japan   " + dfJA.format(d2));
    }

    /**
     * tsting display language and country
     * @date 7/4/11 1:14 PM
     */
    private void scjpChp6_484(){
        Calendar c = Calendar.getInstance();
        c.set(2010,11,14);
        Date d2 = c.getTime();

        Locale locBR = new Locale("pt", "BR"); //Brazil
        Locale locDK = new Locale("da", "DK"); //Denmark
        Locale locIT = new Locale("it", "IT"); //Italy
        //testing
        Locale locJA = new Locale("ja");

        System.out.println("def " + locBR.getDisplayCountry());
        System.out.println("loc " + locBR.getDisplayCountry(locBR));
        System.out.println("loc in JA " + locBR.getDisplayCountry(locJA));

        System.out.println("def " + locDK.getDisplayLanguage());
        System.out.println("loc " + locDK.getDisplayLanguage(locDK));
        System.out.println("D>I " + locDK.getDisplayLanguage(locIT));

    }
}
