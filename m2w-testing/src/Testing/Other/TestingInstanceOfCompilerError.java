/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.Other;

/**
 *
 * @author ruobo
 * @date Jun 13, 2011
 */
public class TestingInstanceOfCompilerError {
//	====================================Attributes=============================================

//      ===================================init & const============================================

//	====================================main method============================================
//    public static void main(String[] args){
//        
//    } // 2 main classes compiles
//	===================================util methods============================================

//      =================================setters & getters=========================================
}

class Cat{}
class Animal{}
class Dog extends Animal{
    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();
//        System.out.println(d instanceof Cat);// can't compile needs to be inherited or a class implemented interface 
        System.out.println(d instanceof Animal);
    }
}