/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SCJP.exc;

import java.io.*;

/**
 *
 * @author ruobo
 */
public class Chp6Q8 {
    public static void main(String[] args){
        Chp6Q8 exc = new Chp6Q8();
        exc.chp6q8();
    }
    
    private void chp6q8(){
        SpecialSerial s = new SpecialSerial();
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("/home/ruobo/Desktop/myFile"));
            os.writeObject(s); os.close();
            System.out.println( "++s.z " + ++s.z + " ");
            
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("/home/ruobo/Desktop/myFile"));
            SpecialSerial s2 = (SpecialSerial)is.readObject();
            is.close();
            System.out.println("deserial transient y: " + s2.y + "\ndeserial triansient wrapper: " + s2.W + "\ndeserial static z: " + s2.z +  " - static is replacable with class reference");
        }catch(Exception e ){System.out.println("exc");}
    }
//    class SpecialSerial implements Serializable{
//        transient int y =7;
//        static int z = 9; // illigal inner class static declaration
//    }
    
}

class SpecialSerial implements Serializable{
        transient int y =7; //y is transient but y is a primitive , so after deserialize, y is 0;
        transient Integer W = 8; //wrapper would be null !!!
        static int z = 9;
    }
