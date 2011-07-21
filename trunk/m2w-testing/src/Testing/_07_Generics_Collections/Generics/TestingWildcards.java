/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._07_Generics_Collections.Generics;

import java.util.*;
/**
 *  m2w : ? wildcard works when declaring a reference for a variable.
 * @author ruobo
 * @date Jul 14, 2011
 */
public class TestingWildcards {
    public static void main(String[] args){
        TestingWildcards m2w = new TestingWildcards();
        m2w.addListOfGChildIntoListOfGParentAsGChildListMain();
        m2w.addListOfGChildIntoListOfGParentAsGParentListMain();
        m2w.testingWildCards();
    }
    
    //--------------------------1-------------------------------------
    /**
     * 
     * @return 
     */
    boolean addListOfGChildIntoListOfGParentAsGParentListMain(){
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Dog());
        this.addGChildIntoListOfGParent(animals);
//        this.addGChildIntoListOfGParentBChild(animals);           // won't compile , Btype have to be Child of ArrayList
        this.addGChildIntoListOfGParent(new LinkedList<Animal>());  // compiles
//        this.addGChildIntoListOfGParent(new LinkedList<Dog>());   // phail!!
        this.addGChildIntoListOfGParent(new LinkedList());          // compiles with warning, Btype is Child
        return true;
    }
    private void addGChildIntoListOfGParent(List<Animal> animals){
        animals.add(new Dog());
    }
    
    private void addGChildIntoListOfGParentBChild(ArrayList<Animal> animals){
        animals.add(new Dog());                                     // has to be Btype Dog
    }
    
    /**
     * m2w: important: this is said that: polymorphism can only apply to base types List & ArrayList, but not Generic types, <Animal> & <Dog>
     * @return 
     * @date 7/14/11 1:35 PM
     */
    private boolean addListOfGChildIntoListOfGParentAsGChildListMain(){
        List<Dog> animals = new ArrayList<Dog>();
        animals.add(new Dog());
        animals.add(new Dog());
//        this.addGChildIntoListOfGParent(animals);//compile failure                                    
//      required: java.util.List<Testing.GenericsAndCollections.Generics.Animal>
//      found: java.util.List<Testing.GenericsAndCollections.Generics.Dog>
        return true;
    }
    
    private void addGChildIntoListGParent_WildCard(List<? extends Animal> animals){
//        animals.add(new Dog());//no suitable method found for add , compile fails
        System.out.println("cannot add using wildcard");
    }
    
//    private void addGChildIntoListGParent_type(List<T extends Animal> animals){} // can't do it like this.
    
    private void takesGChild_WildCard(List<? extends Animal> animals){}
    private void takesGParent_WildCard(List<? super ArrayList<String>> list){}
    
    /**
     * 
     * @return 
     */
    private boolean testingWildCards(){
        this.takesGChild_WildCard(new ArrayList<Dog>());
        this.takesGParent_WildCard(new ArrayList<List<String>>());// yes
        
        this.addGTypeIntoListGType_Wildcard(new ArrayList<Dog>());
        this.addGTypeIntoListGType_Wildcard(new ArrayList<Animal>());
                
        
        return true;
    }
    
    /**
     * m2w: works because collection of supertype of Dog can accept Dog Type objects as elements.
     * @param animals 
     * @date 7/14/11 3:28 PM
     */
    private void addGTypeIntoListGType_Wildcard(List<? super Dog> animals){
        animals.add(new Dog());
//        animals.add(new Animal()); // no can't add Parent
    }
    //---------------------------------------------------------------    

    
    //---------------------------2-----------------------------------    
    
    private void a_testingWildCardsWithNoTypeOrGObject(){
        List<Integer> myList = new ArrayList<Integer>();
        this.testingWildCardsWithNoType(myList);
//        this.testingWildCardsWithGObject(myList);// fail because Gtype pass-in Arg check
    }
    
    private void testingWildCardsWithNoType(List<?> list){
//        list.add(new Dog());// only ? with super can use adding
//        list.add(1);
    }
    private void testingWildCardsWithGObject(List<Object> list){
        list.add(new Dog());// 
    }
    //---------------------------------------------------------------    

    private void a_testingWildcardObjectInstansitation(){
        List<?> list = new ArrayList<Dog>();
        List<? extends Animal> aList = new ArrayList<Dog>();
//        List<?> foo = new ArrayList<? extends Animal>();      //can't use wildcard in object creation. //required: class or interface without bounds
//        List<? extends Dog> cList = new ArrayList<Integer>(); //integer does not extend dog
        List<? super Dog> bList = new ArrayList<Animal>();
//        List<? super Animal>  dList = new ArrayList<Dog>();   //has to be super of animal, like object or animal
    }
    
}

//can see other outter class in other files in the same pakage
