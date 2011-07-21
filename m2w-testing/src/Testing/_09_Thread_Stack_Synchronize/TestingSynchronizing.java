/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._09_Thread_Stack_Synchronize;

/**
 * test1(): synchronize block of code
 * test2(): synchronize method.
 * test3(): static method synchronizing.
 * 1. synchronized keyword need to comes before return type declaration in methods.
 * @author ruobo
 * @date Jul 20, 2011
 */
public class TestingSynchronizing {
    StringBuffer sb;
    static int I = 1;
    TestingSynchronizing(){}
    TestingSynchronizing(StringBuffer sb){
            this.sb = sb;
        }
    public static void main(String[] args){
        TestingSynchronizing m2w1 = new TestingSynchronizing();
        TestingSynchronizing.$test1();
    }

    //===============================1 ============================================
    private static void $test1(){
        TestingSynchronizing m2w = new TestingSynchronizing(new StringBuffer("A"));
        TestingSynchronizing.Test1 t1 = m2w.new Test1();
        TestingSynchronizing.Test1 t2 = m2w.new Test1();
        TestingSynchronizing.Test1 t3 = m2w.new Test1();
        t1.start();
        t2.start();
        t3.start();
    }

    class Test1 extends Thread{
        @Override
        public void run(){
//            synchronized(TestingSynchronizing.this.sb){
            synchronized(this){
                for(int i = 0; i++ < 100;){
                    System.out.println(sb);
                }
                sb.setCharAt(0, (char)(sb.charAt(0) + 1 )) ;
            }
        }
    }

//    class Test1Obj{
//        StringBuffer sb;
//        Test1Obj(StringBuffer sb){
//            this.sb = sb;
//        }
//    }


    //=============================== 2 ===========================================
    synchronized private void  test2(){}
    private synchronized void  test2_(){
        //do stuff
    }

    //=============================== 3 ===========================================
    synchronized private static void test3(){}
    private synchronized static void test3_(){}
    private static synchronized void test3__(){}
    private static void $test3(){
        synchronized(TestingSynchronizing.class){
            TestingSynchronizing.I = 4;
            System.out.println("I: " + TestingSynchronizing.I);
        }
    }
}
