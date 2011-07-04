/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.FileANdIO;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author ruobo
 * @date Jul 4, 2011
 */
public class TestingInputStream {

    public static void main(String[] args){
        try{
            InputStream a = System.in;
            System.in.close();

        }catch(IOException e){e.printStackTrace();}
    }
}
