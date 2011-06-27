/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SCJP;

/**
 *
 * @author ruobo
 * @date 6/20/11 9:12 PMl
 */
public class Exercise5_4 {

}

class BadFoodException extends Exception{
    
}

class MyException{

    public static void main(String[] args){
        MyException me = new MyException();
        try{
            System.out.println("trying input : toufu");
            me.checkFood("toufu");
            System.out.println("trying input : smelly toufu");
            me.checkFood("smelly toufu");
        }catch(BadFoodException bf){
            bf.printStackTrace();
            System.out.println("bah");
        }
    }

    public void checkFood(String food) throws BadFoodException{
        if(food.equals("toufu")){
            System.out.println("yay");
        }else{
            throw new BadFoodException();
        }
        System.out.println("changed on google code");
    }
}