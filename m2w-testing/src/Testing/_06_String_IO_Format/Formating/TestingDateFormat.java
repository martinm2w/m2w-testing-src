/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._06_String_IO_Format.Formating;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author ruobo
 * @date Jul 4, 2011
 */
public class TestingDateFormat {
    public static void main(String[] args){
        TestingDateFormat tdf = new TestingDateFormat();
//        tdf.testingDateFormaConstr();
        tdf.parsingInputIntoDate();
    }

    /**
     * testing different output formats
     * @date 7/4/11 12:13 PM
     */
    private void testingDateFormaConstr(){
        Date d1 = new Date(1000000000000l);

        DateFormat[] dfa = new DateFormat[6];
        dfa[0] = DateFormat.getInstance();
        dfa[1] = DateFormat.getDateInstance();
        dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);

        for(DateFormat df : dfa)
            System.out.println(df.format(d1));
        System.out.println("default = medium");
    }

    /**
     * @date 7/4/11 12:51 PM
     */
    private void parsingInputIntoDate(){
        Date d1 = new Date(1000000000000l);
        System.out.println("d1 = " + d1.toString());

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        String s = df.format(d1);
        //testing:
//        s = s += ",01:01:01";
//        s = "2001, 11, 30";//unparsable
        System.out.println("s: " + s);
        

        try{
            Date d2 = df.parse(s);
            System.out.println("parsed = " + d2.toString());
        }catch(ParseException pe){pe.printStackTrace(); System.out.println("parse exc");}
    }
}
