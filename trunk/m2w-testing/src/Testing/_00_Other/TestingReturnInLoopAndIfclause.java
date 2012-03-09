/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._00_Other;

/**
 * 1. can return in loop
 * 2. can't return in if clause.
 * 3. can return if "if clause" is in a loop
 * @author ruobo
 * @date Mar 8, 2012
 */
public class TestingReturnInLoopAndIfclause {
    public static void main(String[] args){
        TestingReturnInLoopAndIfclause a = new TestingReturnInLoopAndIfclause();
        a.test3();
    }
    private int test1 (){
        for(;;){
            return 1;
        }
    }

//    private int test2(){
//        if(3 > 2){
//            return 2;
//        }
//    }

    private int test3(){
        for(;;){
            if(false){
                return 2;
            }
        }
    }

}
