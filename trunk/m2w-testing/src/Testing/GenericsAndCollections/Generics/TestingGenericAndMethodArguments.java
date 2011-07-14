/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.GenericsAndCollections.Generics;

import java.util.*;
/**
 *
 * @author ruobo
 * @date Jul 13, 2011
 */
public class TestingGenericAndMethodArguments {
    public static void main(String[] args){
        TestingGenericAndMethodArguments m2w = new TestingGenericAndMethodArguments();
//        m2w.takesAnRawType();
    }

    //-----------------1-----------------
    /**
     * m2w: nothing special, compiles just fine
     * @date 7/13/11 9:57 PM
     */
    private void takesAnRawType(){
        List<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        List<String> c = new LinkedList<String>();
        List d = new ArrayList<String>();
        this.takesAnRawTypeUtil1(a);
        this.takesAnRawTypeUtil1(b);
        this.takesAnRawTypeUtil1(c);
        this.takesAnRawTypeUtil1(d);
    }

    private void takesAnRawTypeUtil1(List list){
    }
    //-----------------------------------


    //-----------------2-----------------
    /**
     * m2w: was looking at the animal example on SCJP on page 612.
     * @date 7/13/11 10:03 PM
     */
    private void takesAGenericType(){
        List<List> a = new ArrayList<List>();
        ArrayList<List> b = new ArrayList<List>();
        ArrayList<ArrayList> bb = new ArrayList<ArrayList>();
        List<List> c = new LinkedList<List>();
        List d = new ArrayList<List>();
//        this.takesAGenericType_util1(a);
        this.takesAGenericType_util1(b); // only b compiles!!!!! ---extact match.
//        this.takesAGenericType_util1(bb);// wont compile!!!!----- no polymophism for generic types
//        this.takesAGenericType_util1(c);
//        this.takesAGenericType_util1(d);
        this.takesAGenericType_util1(new ArrayList<List>());//works too
//        this.takesAGenericType_util1(new ArrayList<ArrayList>());// no polymophic here for generic type, only for base type
    }

    private void takesAGenericType_util1(ArrayList<List> list){
    }
    //-----------------------------------




    //---------------3-------------------
    /**
     * m2w: compiles just fine
     * @date 7/13/11 10:54 PM
     */
    private void testAddDogsToCats(){
        Cat[] cats = {new Cat(), new Cat()};
        this.addDogsToCats_util1(cats);
    }

    private void addDogsToCats_util1(Animal[] animals){
        animals[0] = new Dog(); // put a dog into cat
    }
    
    //-----------------------------------
    
    
    //----------------4------------------
    /**
     * m2w: base types polymophics are fine.
     * @date 7/14/11 1:02 PM
     */
    private void addChildTypeIntoParentTypeGenericList(){
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Cat());
        Dog dog1 = new Dog();
        animals.add(dog1);
    }
    
    private void takesAnParentGenricType(){
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        Animal a2 = new Dog();
        this.takesAnParentGenricType_util1(a1);
        this.takesAnParentGenricType_util1(d1);
        this.takesAnParentGenricType_util1(a2);
    }
    private void takesAnParentGenricType_util1(Animal animal){}
    //-----------------------------------
    
    
    
    
    //---------------5-------------------
    private void addListOfChildIntoListOfParentAsParentListMain(){
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Dog());
        this.addChildIntoListOfParent(animals);
    }
    private void addChildIntoListOfParent(List<Animal> animals){
        animals.add(new Dog());
    }
    
    /**
     * m2w: important: this is said that: polymorphism can only apply to base types List & ArrayList, but not Generic types, <Animal> & <Dog>
     * @date 7/14/11 1:15 PM
     */
    private void addListOfChildIntoListOfParentAsChildListMain(){
        List<Dog> animals = new ArrayList<Dog>();
        animals.add(new Dog());
        animals.add(new Dog());
//        this.addChildIntoListOfParent(animals);//compile failure                                    
//      required: java.util.List<Testing.GenericsAndCollections.Generics.Animal>
//      found: java.util.List<Testing.GenericsAndCollections.Generics.Dog>
    }
        
    //-----------------------------------
    
    
    
    
    
    
}
    //---------------34------------------
    class Animal{}
    class Dog extends Animal{}
    class Cat extends Animal{}
    //-----------------------------------

