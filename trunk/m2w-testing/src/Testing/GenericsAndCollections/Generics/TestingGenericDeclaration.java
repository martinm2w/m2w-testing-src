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
public class TestingGenericDeclaration {
    
}

class Rental{
    private List rentalPool;
    private int maxNum;
    public Rental(int maxNum, List rentalPool){
        this.maxNum = maxNum;
        this.rentalPool = rentalPool;
    }

    public Object getRental(){
        return rentalPool.get(0);
    }

    public void returnRental(Object o){
        rentalPool.add(o);
    }
}

class CarRental extends Rental{
    CarRental(int maxNum, List<Car> rentalPool){
        super(maxNum, rentalPool);
    }
    public Car getRental(){
        return (Car) super.getRental();
//        super.
    }
}

class Car{}