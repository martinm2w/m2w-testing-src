/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.GenericsAndCollections.Generics;

import java.util.*;
/**
 *
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
    
    private void takesGChild_WildCard(List<? extends Animal> animals){}
    private void takesGParent_WildCard(List<? super ArrayList<String>> list){}
    
    /**
     * 
     * @return 
     */
    private boolean testingWildCards(){
        this.takesGChild_WildCard(new ArrayList<Dog>());
        this.takesGParent_WildCard(new ArrayList<List<String>>());// yes
        return true;
    }
    //---------------------------------------------------------------    

    
    
    
    
}

//can see other outter class in other files in the same pakage
