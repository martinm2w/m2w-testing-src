/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.GenericsAndCollections.Generics;

import java.util.*;
/**
 * m2w: 1. tested declare Generic type in method, must before return type
 *      2. tested declare Generic type in class declaration.
 *      3. tested declare Generic type in constructor declaration.
 * @author ruobo
 * @date Jul 14, 2011, 7/16/11 10:55 PM
 */
public class TestingGenericDeclaration {
   
    //1. tested declare Generic type in method, must before return type
    public <T> void testGeneric1(T t){
        List<T> a = new ArrayList<T>();
        a.add(t);
        Object o = (Object)t;
        System.out.println(a + " " + t.getClass());
    }
    
    public static void main(String[] args){
        new TestingGenericDeclaration().testGeneric1("dude");
        new TestingGenericDeclaration().testGeneric1(1);
        new TestingGenericDeclaration().testGeneric1(new Cat());
    }
}

    //=========================  rental example on SCJP page 625  =========================================
    //2. tested declare Generic type in class declaration.
    class RentalGeneric<T>{ // T is for the type parameter
        private List<T> rentalPool;  // Use the class type for the List type
        private int maxNum;

        public RentalGeneric(int maxNum, List<T> rentalPool){ // constructor takes a List of the class type
            this.maxNum = maxNum;
            this.rentalPool = rentalPool;
        }

        public T getRental(){// we rent out a T
            //blocks until there's something available
            return rentalPool.get(0);
        }

        public void returnRental(T renturnedThing){//and the renter returns a T
            rentalPool.add(renturnedThing);
        }
    }
    
    class TestRental{
        public static void main(String[] args){
            //make some Cars for the pool
            Car c1 = new Car();
            Car c2 = new Car();
            List<Car> carList = new ArrayList<Car>();
            carList.add(c1);
            carList.add(c2);
            RentalGeneric<Car> carRental = new RentalGeneric<Car>(2, carList);
            //now get a car out, and it won't need a cast
            
            Car carToRent = carRental.getRental();
            carRental.returnRental(carToRent);
            //can we stick something else in the original carlist?
//            carList.add(new Cat("Fluffy"));
        }
    }

    class Car{} class Eclipse extends Car{}
    //=====================================================================================================

    //3. tested declare Generic type in constructor declaration.
    class M2w{
        public <T> M2w(T t){
            System.out.println((Object)t.toString());
        }
    }



//class Rental{
//    private List rentalPool;
//    private int maxNum;
//    public Rental(int maxNum, List rentalPool){
//        this.maxNum = maxNum;
//        this.rentalPool = rentalPool;
//    }
//
//    public Object getRental(){
//        return rentalPool.get(0);
//    }
//
//    public void returnRental(Object o){
//        rentalPool.add(o);
//    }
//}
//
//class CarRental extends Rental{
//    CarRental(int maxNum, List<Car> rentalPool){
//        super(maxNum, rentalPool);
//    }
//    public Car getRental(){
//        return (Car) super.getRental();
////        super.
//    }
//}
//
//class Car{}