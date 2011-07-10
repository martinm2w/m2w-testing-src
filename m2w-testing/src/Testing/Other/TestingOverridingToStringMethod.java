/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.Other;

/**
 *
 * @author ruobo
 * @date 7/10/11 11:57 AM
 */
public class TestingOverridingToStringMethod {
    public static void main(String[] args){
        TestingOverridingToStringMethod tsm = new TestingOverridingToStringMethod();
        tsm.simpleToString();
    }
    
    public void simpleToString(){
        M2w m2w = new M2w(28);
        System.out.println(m2w.toString());
    }
}

class M2w{
    int age;
    public M2w(int in){
        age = in;
    }
    
    @Override
    public String toString(){
        return String.valueOf(age);
    }
}