/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SCJP;

/**
 *
 * @author ruobo
 */
public class Chp3Q6 {
    //    class Raptor extends Bird{
//        static { System.out.println("r1");} // inner class cannot have static declarations
//    }
}


//so assum
class Bird{
        {System.out.print("b1 ");}
        public Bird(){
            System.out.print("b2 ");
        }
}

class Raptor extends Bird{
        static { System.out.print("r1 "  );} // inner class cannot have static declarations
        public Raptor (){
            System.out.print("r2 ");
        }
        { System.out.print("r3 ");}
        static{ System.out.print("r4 ");}
}

class Hawk extends Raptor{
    public static void main(String[] args){
        System.out.print("pre ");
        new Hawk();
        System.out.println("hawk");
        System.out.println("all 3 classes are in one class file, so , to load the file , all static init blocks in 3 classes are done first");
    }
}

