/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SCJP.exc;

import java.util.*;
/**
 *
 * @author ruobo
 * @date Jul 11, 2011
 */
public class Chp7Q1 {
    public static void main(String[] args){
        Chp7Q1 exc = new Chp7Q1();
        exc.chp7q1();
    }
    
    private void chp7q1(){
//        List<List<Integer>> table = new List<List<Integer>>();//list is abstract cannot be instantiated
        List<List<Integer>> table = new ArrayList<List<Integer>>();//correct
//        List<List<Integer>> table = new ArrayList<ArrayList<Integer>>();//type arguement <List<Integer>> must be the same for both sides of the assignment.
//        List<List, Integer> table = ...// can only take 1 arg
        
    }
}
