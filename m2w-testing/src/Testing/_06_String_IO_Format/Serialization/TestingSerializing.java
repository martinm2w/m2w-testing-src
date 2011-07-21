/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._06_String_IO_Format.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 07-05 have to go to the court , humm.. and transformer 3 is on now, going back to china in August. have few more testing classes to write.
 * @author ruobo
 * @date Jul 2, 2011
 */
public class TestingSerializing {
}

/**
 * m2w: serialization example from SCJP page 463
 * @author ruobo
 */
class SerializeDog{
    public static void main(String[] args){
        Collar c = new Collar(3);
        Collar c1 = new Collar(4);
        Dog d = new Dog(c,5);
        Dog dd = new Dog(c1,5);
        System.out.println("before: collar size is " + d.getCollar().getCollarSize());

        try{
            FileOutputStream fs = new FileOutputStream("/home/ruobo/Desktop/SLDog.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(d);
            os.close();
        }catch(Exception e ){e.printStackTrace();}

        try{
            FileInputStream fis = new FileInputStream("/home/ruobo/Desktop/SLDog.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            dd = (Dog) ois.readObject();
            ois.close();
        }catch(Exception e){e.printStackTrace();}

        System.out.println("after:  collar size of dd(was 4) is " + dd.getCollar().getCollarSize());
    }
}

class Dog implements Serializable{
    transient private Collar theCollar;
    private int dogSize;
    public Dog(Collar collar, int size){
        theCollar = collar;
        dogSize = size;
    }

    public Collar getCollar(){return theCollar;}

    //manual serialization.
    private void writeObject(ObjectOutputStream os){
        try{
            os.defaultWriteObject();
            os.writeInt(theCollar.getCollarSize());
        }catch(Exception e ){e.printStackTrace();}
    }

    private void readObject(ObjectInputStream is){
        try{
            is.defaultReadObject();
            theCollar = new Collar(is.readInt());
        }catch(Exception e){e.printStackTrace();}
    }
}

class Collar implements Serializable{
    private int collarSize;
    public Collar(int size){
        collarSize = size;
    }
    public int getCollarSize(){return collarSize;}
}