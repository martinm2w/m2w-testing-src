/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.Other;

/**
 *
 * @author ruobo
 */
public class TestingEnums {
    public enum Suits{
//        
        CLUBS(20), DIAMONDS(20), HEARTS(30), SPADES(30), NOTRUMP(40) // have to start with the enums declarations first
//        {
//            public int getValue(int bid){ return bid-1;}; // this block is ommitable
//        }
        ;// has to have this simi-column
        private int points;
        Suits(int points){this.points = points;}
        public int getValue1(int bid){return points*bid;};
    }
    public static void main(String[] args){
        System.out.println(Suits.CLUBS); // output is : CLUBS
        System.out.println(Suits.values());
        int i = 0;
        for(Suits a : Suits.values()){
            System.out.print(++i);
            System.out.print(a);
            System.out.println(" " + a.points +  " " + a.getValue1(3));
        }
    }
}
