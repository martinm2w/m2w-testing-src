/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._06_String_IO_Format.Formating;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author ruobo
 * @date Jul 4, 2011
 */
public class TestingNumberFormat {
    public static void main(String[] args){
        TestingNumberFormat tnf = new TestingNumberFormat();
        tnf.scjpChp6_485();
        tnf.scjpChp6_486();
    }

    private void scjpChp6_485(){
        float f1 = 123.4567f;
        Locale locFR = new Locale("fr");    //France
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locFR);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locFR);

        for(NumberFormat nf : nfa)
            System.out.println(nf.format(f1));
    }

    private void scjpChp6_486(){
        float f1 = 123.45678f;
        NumberFormat nf = NumberFormat.getInstance();
        System.out.print("rounding, max fraction digits: " + nf.getMaximumFractionDigits() + " ");
        System.out.print(nf.format(f1) + " ");

        nf.setMaximumFractionDigits(5);

        System.out.println(nf.format(f1) + " ");
                nf.setMaximumIntegerDigits(1); // cut of the front.
        System.out.println(nf.format(f1) + "max int digit 1");
        nf.setMaximumIntegerDigits(4); // cut of the front.
        System.out.println(nf.format(123));

        try{
            System.out.println("parsing: " + nf.parse("1234.567"));
            nf.setParseIntegerOnly(true);
            System.out.println("paring int only: " + nf.parse("1234.567"));
        }catch(ParseException pe){System.out.println("parse exc");}
    }
}
