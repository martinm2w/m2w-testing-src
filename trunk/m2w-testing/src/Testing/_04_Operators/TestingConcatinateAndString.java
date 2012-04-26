/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._04_Operators;

/**
 *
 * @author ruobo
 * @date Apr 16, 2012
 */
public class TestingConcatinateAndString {

    public static void main(String[] args){
        System.out.println("a" + (2 + 3));
        System.out.println(1+2+3);
        int a = 0;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a>3?"yes":"no");
        String b = "   slk dj  flsk  jd    ";
        System.out.println(b.trim());
        synchronized(Thread.currentThread()){
            System.out.println(Thread.currentThread().getId());
        }
    }


}
