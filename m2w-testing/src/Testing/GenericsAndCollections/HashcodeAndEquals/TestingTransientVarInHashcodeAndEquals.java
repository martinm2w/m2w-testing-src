/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.GenericsAndCollections.HashcodeAndEquals;

import java.io.*;

/**
 * m2w: 1. u have to cast Generic type back to Wappers if u want to do some operation.
 * @author ruobo
 * @date Jul 16, 2011
 */
public class TestingTransientVarInHashcodeAndEquals {
    
}

    class SaveMe<T> implements Serializable {
        transient T x;
        T y; 
        SaveMe(T xVal, T yVal){
            x = xVal;
            y = yVal;
        }
        
    @Override
        public int hashCode(){
            return((Integer)x + (Integer)y); // if cast to Integer will autounbox and do the ^;
        }
        
    @Override
        public boolean equals(Object o){
            SaveMe test = (SaveMe)o;
            if(test.y == y && test.x == x){//legal, not correct
                return true;
            }else{
                return false;
            }
        }
        
    
        private void writeObject(ObjectOutputStream os){
            try{
                os.defaultWriteObject();
                os.writeInt((Integer)this.x + 1);
            }catch(Exception e){e.printStackTrace();}
        }
        
        private void readObject(ObjectInputStream is){
            try{
                is.defaultReadObject();
                x = (T)(Integer)is.readInt();
            }catch(Exception e){e.printStackTrace();}
        }
        
        public static void main(String[] args){
            SaveMe save1 = new SaveMe(2, 4);
            System.out.print("save1's hashcode: " + save1.hashCode() + "|");
            System.out.println("x,y before serialization: " + save1.x + "," + save1.y);
            
            try{
                ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("/home/ruobo/Desktop/testing IO/testingTransientVarInHashcodeAndEquals"));
                oo.writeObject(save1);
                
                ObjectInputStream oi = new ObjectInputStream(new FileInputStream("/home/ruobo/Desktop/testing IO/testingTransientVarInHashcodeAndEquals"));
                SaveMe save2 = (SaveMe)oi.readObject();
                System.out.print("save2's hashcode: " + save2.hashCode() + "|");
                System.out.println("x,y after serialization: " + save2.x + "," + save2.y);
            }catch(Exception e){e.printStackTrace();}
        }
    }