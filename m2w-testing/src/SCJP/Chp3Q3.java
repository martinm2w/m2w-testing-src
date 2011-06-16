/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SCJP;

import java.util.Arrays;

/**
 *
 * @author ruobo
 */
public class Chp3Q3 {

    public static void main(String[] args){
        int[][] a = {{1,2,}, {3,4}};
        System.out.println(a[0].length);//length is still 2 
//        int[] b = a[1];//doable
        int[] b = (int[]) a[1];
        Object o1 = a;
        int[][] a2 = (int[][])o1;

//        int[] b2 = (int[])o1;//class cast exception
        System.out.println(b[1]);
        System.out.println(a2);


    }


}
